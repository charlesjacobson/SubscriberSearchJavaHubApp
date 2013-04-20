package com.exacttarget.subscribersearch.web;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exacttarget.wsdl.partnerapi.APIObject;
import com.exacttarget.wsdl.partnerapi.Soap;
import com.exacttarget.wsdl.partnerapi.Subscriber;
import com.exacttarget.wsdl.partnerapi.SubscriberStatus;
import com.exacttarget.wsdl.partnerapi.UpdateOptions;
import com.exacttarget.wsdl.partnerapi.UpdateRequest;
import com.exacttarget.wsdl.partnerapi.UpdateResponse;

/**
 * Servlet implementation class Update
 */
public class SubscriberUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubscriberUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");

        String status = request.getParameter("status");

        //
        // Get the soap handle from the servlet context:
        //

        Soap soap = (Soap) request.getSession().getAttribute("soap");

        Subscriber subscriber = new Subscriber();
        subscriber.setID(new Integer(id));
        if (status.toLowerCase().equals("active")) {
            subscriber.setStatus(SubscriberStatus.ACTIVE);
        } else if (status.toLowerCase().equals("unsubscribed")) {
            subscriber.setStatus(SubscriberStatus.UNSUBSCRIBED);
        } else {
            // XXX throw an exception or something
        }

        APIObject[] apiObjects = { subscriber };

        UpdateOptions updateOptions = new UpdateOptions();

        UpdateRequest updateRequest = new UpdateRequest();
        updateRequest.getObjects().addAll(Arrays.asList(apiObjects));
        updateRequest.setOptions(updateOptions);

        UpdateResponse updateResponse = soap.update(updateRequest);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
