package com.ubank.rightnow;
import java.net.PasswordAuthentication;


/**
 * Proxy authenticator that works by presenting username/password when
 * required.
 *
 * @author Glen Appleby 0419236750
 *
 */
public class ProxyAuthenticator extends java.net.Authenticator {


		private String user, password;

        public ProxyAuthenticator(String user, String password) {
               
				this.user = user;
                this.password = password;
        }

        protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password.toCharArray());
        }
        
}