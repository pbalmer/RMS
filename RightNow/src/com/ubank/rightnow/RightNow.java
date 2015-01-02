package com.ubank.rightnow;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

import com.rightnow.ws.base.v1.ID;
import com.rightnow.ws.base.v1.NamedIDHierarchy;
import com.rightnow.ws.knowledge.v1.AnswerContent;
import com.rightnow.ws.knowledge.v1.Content;
import com.rightnow.ws.knowledge.v1.ContentFilterList;
import com.rightnow.ws.knowledge.v1.ContentListResponse;
import com.rightnow.ws.knowledge.v1.ContentRate;
import com.rightnow.ws.knowledge.v1.ContentRequestStatus;
import com.rightnow.ws.knowledge.v1.ContentSearch;
import com.rightnow.ws.knowledge.v1.ObjectFactory;
import com.rightnow.ws.knowledge.v1.SearchResponse;
import com.rightnow.ws.knowledge.v1.ServiceCategoryContentFilter;
import com.rightnow.ws.knowledge.v1.ServiceProductContentFilter;
import com.rightnow.ws.messages.v1.ClientInfoHeader;
import com.rightnow.ws.wsdl.v1.RequestErrorFault;
import com.rightnow.ws.wsdl.v1.RightNowKnowledgePort;
import com.rightnow.ws.wsdl.v1.RightNowKnowledgeService;
import com.rightnow.ws.wsdl.v1.ServerErrorFault;
import com.rightnow.ws.wsdl.v1.UnexpectedErrorFault;

public class RightNow {

	protected final RightNowKnowledgePort rnp;
	protected final String appId;
	protected final ClientInfoHeader clientInfoRequestHeader;
	
	public RightNow(String userName, String password, String appId) {
		this.appId = appId;
		RightNowKnowledgeService rn = new RightNowKnowledgeService();
		rnp = rn.getRightNowKnowledgePort();
		BindingProvider bindingProvider = (BindingProvider) rnp;

		final Binding binding = bindingProvider.getBinding();
		List<Handler> handlerList =  binding.getHandlerChain();
		if (handlerList == null)
			handlerList = new ArrayList<Handler>();

		handlerList.add(new com.ubank.rightnow.SecurityHandler(userName, password));
		handlerList.add(new com.ubank.rightnow.LoggingHandler());
		binding.setHandlerChain(handlerList);

		clientInfoRequestHeader = new ClientInfoHeader();
		clientInfoRequestHeader.setAppID(appId);
	}
	
	protected ContentFilterList getContentFilterList(List<Long> product, List<Long> category) {
		ContentFilterList cfl = new ContentFilterList();
		
		// Filter the answers that are assigned to the product id = 846
		if (product != null) {
			for (int i = 0; i < product.size(); i++) {
				ServiceProductContentFilter productFilter = new ServiceProductContentFilter();
				NamedIDHierarchy prodHierarchy = new NamedIDHierarchy();
				ID prodId = new ID();
				prodId.setId(product.get(i));
				prodHierarchy.setID( prodId );
				productFilter.setServiceProduct( prodHierarchy );
				
				cfl.getContentFilterList().add(productFilter);
			}
		}
		
		// Filter the answers that are assigned to the category id = 1165 
		if (category != null) {
			for (int i = 0; i < category.size(); i++) {
				ServiceCategoryContentFilter categoryFilter = new ServiceCategoryContentFilter();
				NamedIDHierarchy serviceCategory = new NamedIDHierarchy();
				ID catId = new ID();
				catId.setId(category.get(i));
				serviceCategory.setID( catId ); 
				categoryFilter.setServiceCategory( serviceCategory );
				
				cfl.getContentFilterList().add(categoryFilter);
			}
		}
		
		return cfl;
	}
	
	public String startInteraction(String ip, String userAgent) {
		try {
			String interactionId = rnp.startInteraction(appId, ip, null, userAgent, clientInfoRequestHeader);
			return interactionId;
		} catch (RequestErrorFault | ServerErrorFault | UnexpectedErrorFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public SearchResponse search(String interactionId, String search, List<Long> product, List<Long> category, int items, int page) {
		SearchResponse sr = null;
		try {
			ContentFilterList cfl = getContentFilterList(product, category);
			sr = rnp.searchContent(interactionId, search, cfl, true, true, new Integer(items), null, null, null, new Integer(items*page), clientInfoRequestHeader);
		} catch (RequestErrorFault | ServerErrorFault | UnexpectedErrorFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sr;
	}
	
	public ContentListResponse popularContent(String interactionId, int items, List<Long> product, List<Long> category) {
		
		// The max items that can be returned are 10.
		if (items > 10) items = 10;
		
		ContentListResponse clr = null;
		
		ContentFilterList cfl = getContentFilterList(product, category);
		ObjectFactory of = new ObjectFactory();
		
		JAXBElement<ContentFilterList> filters = of.createContentFilterList(cfl);
		// If there are no filters, don't pass them into the call.
		if (cfl.getContentFilterList().size() == 0) filters = null;
		
		ContentSearch cs = new ContentSearch();
		cs.setFilters( filters );
		
		try {
			clr = rnp.getPopularContent(interactionId, cs, new Integer(items), null, clientInfoRequestHeader);
		} catch (RequestErrorFault | ServerErrorFault | UnexpectedErrorFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clr;
	}
	
	public AnswerContent getSolution(String interactionId, String solutionId) {
		ID id = new ID();
		System.out.println("Get Solution: " + Long.parseLong(solutionId));
		id.setId(Long.parseLong(solutionId));
		AnswerContent contentTemplate = new AnswerContent();
		contentTemplate.setID(id);
		AnswerContent content = null;
		try {
			// Get the content and mark it as viewed so that RightNow can learn what is useful.
			content = (AnswerContent) rnp.getContent(interactionId, contentTemplate, null, null, clientInfoRequestHeader);
			markViewed(interactionId, content.getID().getId());
		} catch (RequestErrorFault | ServerErrorFault | UnexpectedErrorFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return content;
	}
	
	protected void markViewed(String interactionId, long contentId) {
		ID id = new ID();
		id.setId(new Long(contentId));
		ObjectFactory of = new ObjectFactory();
		AnswerContent kc = of.createAnswerContent();
		kc.setID(id);
		try {
			rnp.markContentAsViewed(interactionId, kc, null, clientInfoRequestHeader);
		} catch (RequestErrorFault | ServerErrorFault | UnexpectedErrorFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ContentListResponse getRelatedContent(String interactionId, Content content, int items) {
		ContentListResponse clr = null;
		
		// The max items that can be returned are 10.
		if (items > 10) items = 10;
		
		try {
			ObjectFactory of = new ObjectFactory();
			AnswerContent kc = of.createAnswerContent();
			kc.setID(content.getID());
			
			clr = rnp.getRecommendedContent(interactionId, kc, new Integer(items), clientInfoRequestHeader);
		} catch (RequestErrorFault | ServerErrorFault | UnexpectedErrorFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clr;
	}
	
	public void rateContent(String interactionId, Content content, boolean helpful) {
		ID rateId = new ID();
		if (helpful) {
			rateId.setId(new Long(2));
		}
		else {
			rateId.setId(new Long(1));
		}
		ContentRate rate = new ContentRate();
		rate.setID(rateId);
		ID scaleId = new ID();
		scaleId.setId(new Long(2)); /* The scale is the max value the rating can have. */
		ContentRate scale = new ContentRate();
		scale.setID(scaleId);
		ObjectFactory of = new ObjectFactory();
		AnswerContent kc = of.createAnswerContent();
		kc.setID(content.getID());
		try {
			ContentRequestStatus crs = rnp.rateContent(interactionId, kc, rate, scale, clientInfoRequestHeader);
			System.out.println("Rate Status: " + crs.getStatus().getName());
		} catch (RequestErrorFault | ServerErrorFault | UnexpectedErrorFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
