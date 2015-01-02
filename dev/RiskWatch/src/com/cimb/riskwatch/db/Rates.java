package com.cimb.riskwatch.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Map;
import java.util.TreeMap;

import com.cimb.riskwatch.data.FXPair;
import com.cimb.riskwatch.data.FXPrice;
import com.cimb.riskwatch.data.Price;
import com.cimb.riskwatch.data.Product;

public class Rates {

	protected static Map<Product, Price> rates;
	protected static Map<FXPair, FXPrice> fxRates;
	
	public static String intermediateCcy = "USD";
	
	// Default the timeout to 1 minute
	public static long TIMEOUT = 60000;
	private static long pricesLoaded = 0;
	private static long fxLoaded = 0;
	
	static {
		 rates = new TreeMap<Product, Price>();
		 fxRates = new TreeMap<FXPair, FXPrice>();
	}

	public synchronized static Price getPrice(Product prod) {
		long now = Calendar.getInstance().getTimeInMillis();
		if (pricesLoaded == 0 || now + TIMEOUT < pricesLoaded) {
			loadRates();
			pricesLoaded = now;
		}
		
		return rates.get(prod);
	}
	
	public static double convert(double qty, String fromCcy) {
		return convert(qty, fromCcy, intermediateCcy);
	}
	
	public static double convert(double qty, String fromCcy, String toCcy) {
		if (fromCcy.equals(toCcy)) return qty;
		
		FXPrice price = findPrice(fromCcy, intermediateCcy);
		double baseQty = qty;
		if (price != null)
			baseQty = price.convertTo(intermediateCcy, qty);
		
		price = findPrice(intermediateCcy, toCcy);
		double toQty = 0;
		if (price != null)
			toQty = price.convertTo(toCcy, baseQty);
		
		return toQty;
	}
	
	protected synchronized static FXPrice findPrice(String ccy1, String ccy2) {
		long now = Calendar.getInstance().getTimeInMillis();
		if (fxLoaded == 0 || now + TIMEOUT < fxLoaded) {
			loadFXRates();
			fxLoaded = now;
		}
		
		if (ccy1.equals(ccy2)) {
			// If they are the same, return a rate of 1.
			FXPair pair = new FXPair(ccy1, ccy2);
			return new FXPrice(pair, 1, 1);
		}
		FXPair pair = new FXPair(ccy1, ccy2);
		FXPrice price = fxRates.get(pair);
		
		if (price == null) {
			// We couldn't find the pair, so now try the inverse...
			pair = new FXPair(ccy2, ccy1);
			price = fxRates.get(pair);
		}
		
		// Return whatever we have.  This may be null.
		return price;
	}
	
	protected static void loadRates() {
		PreparedStatement stmnt = null;
		try {
			String sql = "SELECT P.ExchangeCode, P.ContractCode, Bid, Offer, Ccy from Prices Pr " +
						"inner join Products P on Pr.ExchangeCode = P.ExchangeCode and Pr.ContractCode = P.ContractCode";
			System.out.println("Creating statement...");
			System.out.println(sql);
			Connection conn = DB.getConnection();
			stmnt = conn.prepareStatement(sql);
			ResultSet rs = stmnt.executeQuery();
			
			while (rs.next()) {
				Product prod = new Product(rs.getString("ExchangeCode"),
											rs.getString("ContractCode"));
				
				// Deal with the special case where listed UK and Aus products are quoted in pence/cents.
				double multiplyer = 1;
				String prodCcy = rs.getString("Ccy");
				if (prodCcy.equals("AUD") || prodCcy.equals("GBP")) multiplyer = 100;
				
				Price price = new Price(prod,
										rs.getDouble("Bid") / multiplyer,
										rs.getDouble("Offer") / multiplyer);
				rates.put(prod, price);
			}
		} catch (SQLException se) {
			//Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			//Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			//finally block used to close resources
			try {
				if (stmnt != null)
					stmnt.close();
			} catch (SQLException se2) {
				// nothing we can do
			}
		}
	}
	
	protected static void loadFXRates() {
		PreparedStatement stmnt = null;
		try {
			String sql = "SELECT Ccy1, Ccy2, Bid, Offer from FXRates";
			System.out.println("Creating statement...");
			System.out.println(sql);
			Connection conn = DB.getConnection();
			stmnt = conn.prepareStatement(sql);
			ResultSet rs = stmnt.executeQuery();
			
			while (rs.next()) {
				FXPair pair = new FXPair(rs.getString("Ccy1"),
										rs.getString("Ccy2"));
				FXPrice price = new FXPrice(pair,
										rs.getDouble("Bid"),
										rs.getDouble("Offer"));
				fxRates.put(pair, price);
			}
		} catch (SQLException se) {
			//Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			//Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			//finally block used to close resources
			try {
				if (stmnt != null)
					stmnt.close();
			} catch (SQLException se2) {
				// nothing we can do
			}
		}
	}
}
