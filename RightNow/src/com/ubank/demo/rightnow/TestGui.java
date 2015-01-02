package com.ubank.demo.rightnow;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Authenticator;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.AbstractButton;
import javax.swing.AbstractListModel;
import javax.swing.ButtonModel;
import javax.swing.JEditorPane;
import javax.swing.ListSelectionModel;
import javax.swing.JList;
import javax.swing.JToggleButton;
import javax.swing.JTextField;

import com.rightnow.ws.knowledge.v1.AnswerContent;
import com.rightnow.ws.knowledge.v1.ContentListResponse;
import com.rightnow.ws.knowledge.v1.SearchResponse;
import com.rightnow.ws.knowledge.v1.SummaryContent;
import com.rightnow.ws.knowledge.v1.SummaryContentList;
import com.ubank.rightnow.ProxyAuthenticator;
import com.ubank.rightnow.RightNow;

import javax.swing.JLabel;

import java.awt.Dialog.ModalityType;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;


public class TestGui extends JFrame {
	private JTextField txtSearch;
	protected JList listPages = null;
	protected JList listSearchResults = null;
	protected JList listRecommendedResults = null;
	protected JEditorPane lblContent = null;
	protected RightNow rightNow = null;
	protected int items = 20;
	protected int numPages = 0;
	protected int page = 0;
	protected List<Long> product = new ArrayList<Long>();
	protected List<Long> category = new ArrayList<Long>();
	protected List<String> summaryList = new ArrayList<String>();
	protected List<String> recommendedList = new ArrayList<String>();
	protected AnswerContent content = null;
	private JPanel panel_3;
	private JPanel panel_2;
	private JToggleButton tglbtnTransferMoney;
	private JToggleButton tglbtnManageMyAccount;
	private JToggleButton tglbtnEarningInterest;
	private JToggleButton tglbtnAboutUbank;
	private JToggleButton tglbtnSmsf;
	private JToggleButton tglbtnUhomeloan;
	private JPanel panel_4;
	private JButton btnSearch;
	private JPanel panel_5;
	private JPanel panel_1_1;
	private JLabel lblNewLabel;
	private JButton btnYes;
	private JPanel panel_6;
	protected String interactionId = null;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			// Load the authenticator for proxies
			Authenticator.setDefault(new ProxyAuthenticator(System
					.getProperty("proxy.userName"), System
					.getProperty("proxy.userPassword")));

			TestGui dialog = new TestGui();
			dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TestGui() {
		setTitle("Right Now Demo");
		setBounds(100, 100, 944, 581);
		getContentPane().setLayout(new BorderLayout(0, 0));
		{
			JList listComponents = new JList();
			listComponents.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			listComponents.setModel(new AbstractListModel() {
				String[] values = new String[] { "Term Deposit", "Term Deposit SMSF",
						"Mortgages Fixed", "Mortgages Variable",
						"Savings Feed", "Savings SMSF" };

				public int getSize() {
					return values.length;
				}

				public Object getElementAt(int index) {
					return values[index];
				}
			});
//			getContentPane().add(listComponents, BorderLayout.WEST);
		}
		{
			panel_3 = new JPanel();
			getContentPane().add(panel_3, BorderLayout.NORTH);
			panel_3.setLayout(new BorderLayout(0, 0));
			{
				panel_2 = new JPanel();
				panel_3.add(panel_2);
				panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				{
					tglbtnTransferMoney = new JToggleButton("Transfer Money");
					tglbtnTransferMoney.addChangeListener(new ProductChangeListener(581));
					panel_2.add(tglbtnTransferMoney);
				}
				{
					tglbtnManageMyAccount = new JToggleButton("Manage My Account");
					tglbtnManageMyAccount.addChangeListener(new ProductChangeListener(558));
					panel_2.add(tglbtnManageMyAccount);
				}
				{
					tglbtnEarningInterest = new JToggleButton("Earning Interest");
					tglbtnEarningInterest.addChangeListener(new ProductChangeListener(566));
					panel_2.add(tglbtnEarningInterest);
				}
				{
					tglbtnAboutUbank = new JToggleButton("About UBank");
					tglbtnAboutUbank.addChangeListener(new ProductChangeListener(575));
					panel_2.add(tglbtnAboutUbank);
				}
				{
					tglbtnSmsf = new JToggleButton("SMSF");
					tglbtnSmsf.addChangeListener(new ProductChangeListener(587));
					panel_2.add(tglbtnSmsf);
				}
				{
					tglbtnUhomeloan = new JToggleButton("UHomeLoan");
					tglbtnUhomeloan.addChangeListener(new ProductChangeListener(570));
					panel_2.add(tglbtnUhomeloan);
				}
			}
			{
				panel_4 = new JPanel();
				panel_3.add(panel_4, BorderLayout.NORTH);
				panel_4.setLayout(new BorderLayout(0, 0));
				{
					txtSearch = new JTextField();
					panel_4.add(txtSearch, BorderLayout.CENTER);
					txtSearch.setColumns(10);
				}
				{
					btnSearch = new JButton("Search");
					panel_4.add(btnSearch, BorderLayout.EAST);
					btnSearch.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (rightNow == null) {
								rightNow = new RightNow("P690751", "Appleby01", "Sample KF Client");
								interactionId = rightNow.startInteraction("192.168.2.1", "Java App");
							}
							
							String searchText = txtSearch.getText();
							if (searchText.equals("")) {
								searchPopular();
							}
							else {
								searchKnowledge(searchText, 0);
							}
						}
					} );
				}
			}
		}
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 0));
			{
				panel_5 = new JPanel();
				panel.add(panel_5, BorderLayout.WEST);
				panel_5.setLayout(new BorderLayout(0, 0));
				{
					panel_1_1 = new JPanel();
					panel_5.add(panel_1_1, BorderLayout.CENTER);
					panel_1_1.setLayout(new BorderLayout(0, 0));
					{
						listSearchResults = new JList();
						panel_1_1.add(listSearchResults);
						listSearchResults.addListSelectionListener(new ListSelectionListener() {
							@Override
							public void valueChanged(ListSelectionEvent e) {
								if (!e.getValueIsAdjusting()) {
									String summary = (String) listSearchResults.getSelectedValue();
									if (summary != null) {
										String id[] = summary.split(" - ", 0);
										getSolution(id[0]);
									}
								}
							}
						});
					}
					{
						listPages = new JList<>();
						panel_1_1.add(listPages, BorderLayout.SOUTH);
						listPages.addListSelectionListener(new ListSelectionListener() {
							@Override
							public void valueChanged(ListSelectionEvent e) {
								if (!e.getValueIsAdjusting()) {
									String searchText = txtSearch.getText();
									if (searchText.equals("")) {
										searchPopular();
									}
									else {
										int newPage = e.getFirstIndex();
										if (newPage == page) newPage = e.getLastIndex();
										System.out.println("Getting page: " + newPage);
										searchKnowledge(searchText, newPage);
									}
								}
							}
						});
					}
				}
			}
			{
				panel_6 = new JPanel();
				panel.add(panel_6, BorderLayout.CENTER);
				panel_6.setLayout(new BorderLayout(0, 0));
				{
					JPanel panel_1 = new JPanel();
					panel_6.add(panel_1, BorderLayout.SOUTH);
					FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
					flowLayout.setAlignment(FlowLayout.LEFT);
					{
						lblNewLabel = new JLabel("Helpful?");
						panel_1.add(lblNewLabel);
					}
					{
						btnYes = new JButton("Yes");
						panel_1.add(btnYes);
						btnYes.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								rateContent(true);
							}
						} );
					}
					{
						JButton btnNo = new JButton("No");
						panel_1.add(btnNo);
						btnNo.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								rateContent(false);
							}
						} );
					}
				}
				{
					JPanel panel_1_2 = new JPanel();
					panel_6.add(panel_1_2, BorderLayout.CENTER);
					panel_1_2.setLayout(new BorderLayout(0, 0));
					{
						lblContent = new JEditorPane();
						panel_1_2.add(lblContent, BorderLayout.CENTER);
					}
					{
						listRecommendedResults = new JList();
						panel_1_2.add(listRecommendedResults, BorderLayout.SOUTH);
						listRecommendedResults.addListSelectionListener(new ListSelectionListener() {
							@Override
							public void valueChanged(ListSelectionEvent e) {
								String summary = (String) listRecommendedResults.getSelectedValue();
								if (summary != null) {
									String id[] = summary.split(" - ", 0);
									txtSearch.setText(id[1]);
								}
							}
						});
						listRecommendedResults.setModel(new AbstractListModel() {
							public int getSize() {
								return recommendedList.size();
							}
							
							public Object getElementAt(int index) {
								return recommendedList.get(index);
							}
						});
					}
				}
			}
		}
	}
	
	protected void searchPopular() {
		ContentListResponse clr = rightNow.popularContent(interactionId, items, product, category);
		
		// Sort out the paging.
		numPages = 1;
		processSummaryList(true, clr.getSummaryContents().getValue());
		clr.getSummaryContents().getValue();
	}
	
	protected void searchKnowledge(String searchText, int page) {
		this.page = page;
		SearchResponse sr = rightNow.search(interactionId, searchText, product, category, items, page);
		
		// Sort out the paging.
		numPages = (sr.getTotalResults() / items) + 1;
		
		processSummaryList(true, sr.getSummaryContents().getValue());
	}
	
	protected void getSolution(String id) {
		content = rightNow.getSolution(interactionId, id);
		String solution = "Title: " + content.getSummary() + "\n";
		solution += content.getSolution().getValue();
		lblContent.setText(solution);
		
		getRecommended(content);
	}
	
	protected void rateContent(boolean helpful) {
		if (content != null) {
			rightNow.rateContent(interactionId, content, helpful);
		}
	}
	
	protected void getRecommended(AnswerContent content) {
		ContentListResponse clr = rightNow.getRelatedContent(interactionId, content, items);
		
		processSummaryList(false, clr.getSummaryContents().getValue());
	}
	
	protected void processSummaryList(boolean isMainSearch, SummaryContentList contents) {
		if (isMainSearch) {
			// Add the pages into the GUI
			listPages.setModel(new AbstractListModel() {
				public int getSize() {
					return numPages; 
				}
	
				public Object getElementAt(int index) {
					return index + 1;
				}
			});
			
			// Now for the list of knowledge items.
			List<SummaryContent> scl = contents.getSummaryContentList();
			summaryList = new ArrayList<String>();
			
			for (int i = 0; i < scl.size(); i++) {
				summaryList.add(scl.get(i).getID().getId() + " - " + scl.get(i).getTitle());
			}
			
			listSearchResults.setModel(new AbstractListModel() {
				public int getSize() {
					return summaryList.size();
				}
				
				public Object getElementAt(int index) {
					return summaryList.get(index);
				}
			});
		}
		else {
			List<SummaryContent> scl = contents.getSummaryContentList();
			recommendedList = new ArrayList<String>();
			
			for (int i = 0; i < scl.size(); i++) {
				recommendedList.add(scl.get(i).getID().getId() + " - " + scl.get(i).getTitle());
			}
			
			listRecommendedResults.setModel(new AbstractListModel() {
				public int getSize() {
					return recommendedList.size();
				}
				
				public Object getElementAt(int index) {
					return recommendedList.get(index);
				}
			});
		}
	}
	
	class ProductChangeListener implements ChangeListener {
		
		private final int productId;
		
		public ProductChangeListener(int productId) {
			this.productId = productId;
		}
		
		@Override
		public void stateChanged(ChangeEvent changeEvent) {
			AbstractButton abstractButton = (AbstractButton) changeEvent.getSource();
			ButtonModel buttonModel = abstractButton.getModel();
			boolean armed = buttonModel.isArmed();
			boolean selected = buttonModel.isSelected();
			if (!armed) {
				if (selected) {
					product.add(new Long(productId));
				}
				else {
					product.remove(new Long(productId));
				}
			}
		}
	}

}
