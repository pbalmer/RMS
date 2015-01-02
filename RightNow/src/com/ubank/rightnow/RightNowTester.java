package com.ubank.rightnow;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

import com.rightnow.ws.knowledge.v1.AnswerContent;
import com.rightnow.ws.knowledge.v1.SearchResponse;
import com.rightnow.ws.knowledge.v1.SummaryContent;
import com.rightnow.ws.knowledge.v1.SummaryContentList;
import com.rightnow.ws.messages.v1.ClientInfoHeader;
import com.rightnow.ws.wsdl.v1.RightNowKnowledgePort;
import com.rightnow.ws.wsdl.v1.RightNowKnowledgeService;

public class RightNowTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		URL wsdlLocation;

		// Load the authenticator for proxies
		Authenticator.setDefault(new ProxyAuthenticator(System
				.getProperty("proxy.userName"), System
				.getProperty("proxy.userPassword")));

		try {
			wsdlLocation = new URL(
					"http://ubankhelp--tst.custhelp.com/cgi-bin/ubankhelp--tst.cfg/services/kf_soap?wsdl");

			// http://wsdlbrowser.com/soapclient?wsdl_url=http%3A%2F%2Fubankhelp--tst.custhelp.com%2Fcgi-bin%2Fubankhelp--tst.cfg%2Fservices%2Fkf_soap%3Fwsdl&function_name=StartInteraction

			RightNowKnowledgeService rn = new RightNowKnowledgeService();
			RightNowKnowledgePort rnp = rn.getRightNowKnowledgePort();
			BindingProvider bindingProvider = (BindingProvider) rnp;

			final Binding binding = bindingProvider.getBinding();
			List<Handler> handlerList =  binding.getHandlerChain();
			if (handlerList == null)
				handlerList = new ArrayList<Handler>();

			String user = "P690751";
			String pass = "Appleby01";

			handlerList.add(new com.ubank.rightnow.SecurityHandler(user, pass));
			binding.setHandlerChain(handlerList);

			ClientInfoHeader clientInfoRequestHeader = new ClientInfoHeader();
			clientInfoRequestHeader.setAppID("Sample KF Client");

			// this fails with a "missing soap header"
			String id = rnp.startInteraction("MiTest App", "192.168.0.100",
					null, "Java App", clientInfoRequestHeader);
			System.out.println("Interaction ID: " + id);

			SearchResponse sr = rnp.searchContent(id, "What are the best interest rates", null, true, true, 50, null, null, null, null, clientInfoRequestHeader);
			System.out.println("Search Response: " + sr.getTotalResults());
			
			SummaryContentList contents = sr.getSummaryContents().getValue();
			List<SummaryContent> scl = contents.getSummaryContentList();
			
			for (int i = 0; i < sr.getTotalResults(); i++) {
				System.out.println("Response " + i + ": " + scl.get(i).getID().getId() + "\t\t" + scl.get(i).getTitle());
				//System.out.println(scl.get(i).getExcerpt());
				
				AnswerContent contentTemplate = new AnswerContent();
				contentTemplate.setID(scl.get(i).getID());
				AnswerContent content = (AnswerContent) rnp.getContent(id, contentTemplate , null, null, clientInfoRequestHeader);
				System.out.println("Name: \t"+ content.getName());
				System.out.println("Solution\n"+ content.getSolution().getValue());
				
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
