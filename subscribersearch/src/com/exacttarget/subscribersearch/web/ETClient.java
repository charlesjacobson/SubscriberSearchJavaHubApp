package com.exacttarget.subscribersearch.web;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPFactory;

import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.configuration.security.FiltersType;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.message.Message;
import org.apache.cxf.transport.http.HTTPConduit;

import com.exacttarget.wsdl.partnerapi.PartnerAPI;
import com.exacttarget.wsdl.partnerapi.Soap;

public class ETClient {
	
	public static final String XSD_URL = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
	
	private Soap soap = null;	
	private String internalAuthToken = null;
	private String oauthToken = null;
	
	
	/**
	 * Get Soap instance to make SOAP calls with ET specific Security headers
	 * 
	 * @return the soap
	 */
	public Soap getSoap() {
		if (this.soap == null) {
			try {
				PartnerAPI service = new PartnerAPI();
				Soap stub = service.getSoap();

				Client client = ClientProxy.getClient(stub);
				Endpoint endPoint = client.getEndpoint();

				List<Header> headers = new ArrayList<Header>();

				SOAPFactory sf = SOAPFactory.newInstance();

				SOAPElement oauthTokenEl = sf.createElement(new QName(null, "oAuthToken"));
				oauthTokenEl.addTextNode(internalAuthToken);
				SOAPElement oauthEl = sf.createElement(new QName("http://exacttarget.com", "oAuth"));
				oauthEl.addChildElement(oauthTokenEl);

				Header oAuth = new Header(new QName("http://exacttarget.com", "oAuth"), oauthEl);
				headers.add(oAuth);

				SOAPElement securityEl = sf.createElement(new QName(XSD_URL, "Security"));
				SOAPElement usernameTokenEl = sf.createElement(new QName(XSD_URL, "UsernameToken"));
				SOAPElement usernameEl = sf.createElement(new QName(XSD_URL, "Username"));
				usernameEl.addTextNode("*");
				SOAPElement passwordEl = sf.createElement(new QName(XSD_URL, "Password"));
				passwordEl.addTextNode("*");
				usernameTokenEl.addChildElement(usernameEl);
				usernameTokenEl.addChildElement(passwordEl);
				securityEl.addChildElement(usernameTokenEl);

				Header tokenHeader = new Header(new QName(XSD_URL, "Security"), securityEl);
				headers.add(tokenHeader);

				client.getRequestContext().put(Header.HEADER_LIST, headers);
				client.getRequestContext().put(Message.ENDPOINT_ADDRESS, PropertiesHelper.getAppProperty("SOAP_ENDPOINT"));
				client.getRequestContext().put(Message.ENCODING, "UTF-8");

				//if (debug) {
					endPoint.getInInterceptors().add(new LoggingInInterceptor());
					endPoint.getOutInterceptors().add(new LoggingOutInterceptor());
				//}
				HTTPConduit conduit = (HTTPConduit) client.getConduit();
				TLSClientParameters tlsClientParameters = new TLSClientParameters();
				tlsClientParameters.setSecureSocketProtocol("SSL");
				conduit.setTlsClientParameters(tlsClientParameters);
				FiltersType filters = new FiltersType();
				filters.getInclude().add("SSL_RSA_WITH_RC4_128_SHA");
				tlsClientParameters.setCipherSuitesFilter(filters);
				this.soap = stub;
			} catch (Exception e) {
				System.out.println("Exception was thrown:");
			}
		}
		return this.soap;
	}


	public String getInternalAuthToken() {
		return internalAuthToken;
	}


	public void setInternalAuthToken(String internalAuthToken) {
		this.internalAuthToken = internalAuthToken;
	}


	public void setSoap(Soap soap) {
		this.soap = soap;
	}


	public String getOauthToken() {
		return oauthToken;
	}


	public void setOauthToken(String oauthToken) {
		this.oauthToken = oauthToken;
	}
	
		

}
