package com.ubank.rightnow;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

// See: Adopted from the article http://www.coderanch.com/t/562144/Web-Services/java/Generating-client-code-wsdl-file

public class SecurityHandler implements
		SOAPHandler<SOAPMessageContext> {

	public SecurityHandler(String userName, String password)
	{
		setCredentials(userName, password);
	}
	
	private String userName;
	private String password;
	
	public void setCredentials(String userName, String password)
	{
		this.userName = userName;
		this.password = password;
	}
	
	@Override
	public boolean handleMessage(final SOAPMessageContext msgCtx) {

		// Indicator telling us which direction this message is going in
		final Boolean outInd = (Boolean) msgCtx
				.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		// Handler must only add security headers to outbound messages
		if (outInd.booleanValue()) {
			try {
				SOAPEnvelope envelope = msgCtx.getMessage().getSOAPPart()
						.getEnvelope();
				SOAPHeader header = envelope.getHeader();
				if (header == null)
					header = envelope.addHeader();

				SOAPElement security = header
						.addChildElement(
								"Security",
								"wsse",
								"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");

				SOAPElement usernameToken = security.addChildElement(
						"UsernameToken", "wsse");

				SOAPElement username = usernameToken.addChildElement(
						"Username", "wsse");
				username.addTextNode(this.userName);

				SOAPElement password = usernameToken.addChildElement(
						"Password", "wsse");
				password.setAttribute(
						"Type",
						"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
				password.addTextNode(this.password);

			} catch (final Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}

	// Other required methods on interface need no guts

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close(MessageContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}
}