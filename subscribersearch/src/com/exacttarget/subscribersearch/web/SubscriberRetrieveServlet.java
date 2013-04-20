package com.exacttarget.subscribersearch.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exacttarget.wsdl.partnerapi.APIObject;
import com.exacttarget.wsdl.partnerapi.RetrieveRequest;
import com.exacttarget.wsdl.partnerapi.RetrieveRequestMsg;
import com.exacttarget.wsdl.partnerapi.RetrieveResponseMsg;
import com.exacttarget.wsdl.partnerapi.SimpleFilterPart;
import com.exacttarget.wsdl.partnerapi.SimpleOperators;
import com.exacttarget.wsdl.partnerapi.Soap;
import com.exacttarget.wsdl.partnerapi.Subscriber;

public class SubscriberRetrieveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubscriberRetrieveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");

        //
        // Get the soap handle from the servlet context:
        //

        Soap soap = (Soap) request.getSession().getAttribute("soap");

        RetrieveRequest retrieveRequest = new RetrieveRequest();
        retrieveRequest.setObjectType("Subscriber");
        retrieveRequest.getProperties().add("ID");
        retrieveRequest.getProperties().add("CreatedDate");
        retrieveRequest.getProperties().add("EmailAddress");
        retrieveRequest.getProperties().add("Status");
        retrieveRequest.getProperties().add("SubscriberKey");

        SimpleFilterPart filter = new SimpleFilterPart();
        filter.setProperty("ID");
        filter.setSimpleOperator(SimpleOperators.EQUALS);
        filter.getValue().add(id);

        retrieveRequest.setFilter(filter);

        RetrieveRequestMsg retrieveRequestMsg = new RetrieveRequestMsg();
        retrieveRequestMsg.setRetrieveRequest(retrieveRequest);

        RetrieveResponseMsg retrieveResponseMsg =
                soap.retrieve(retrieveRequestMsg);

        //
        // Build a JSON string from the retrieve response results:
        //

        //response.setContentType("application/json");
        
        // not sure why fuelui doesn't like app/json
        response.setContentType("text/html; charset=UTF-8");

        StringBuilder result = new StringBuilder("{\"subscribers\":[");

        boolean first = true;
        for (APIObject apiObject : retrieveResponseMsg.getResults()) {
            Subscriber subscriber = (Subscriber) apiObject;
            if (!first) {
                result.append(",");
            }
            first = false;
            result.append("{");
            result.append("\"ID\":\"");
            result.append(subscriber.getID().toString());
            result.append("\",");
            result.append("\"EmailAddress\":\"");
            result.append(subscriber.getEmailAddress());
            result.append("\",");
            result.append("\"SubscriberKey\":\"");
            result.append(subscriber.getSubscriberKey());
            result.append("\",");
            result.append("\"CreatedDate\":\"");
            result.append(subscriber.getCreatedDate().toString());
            result.append("\",");
            result.append("\"Status\":\"");
            result.append(subscriber.getStatus().toString());
            result.append("\"");
            result.append("}");
        }

        result.append("]}");

        PrintWriter out = response.getWriter();

        out.println(result.toString());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
