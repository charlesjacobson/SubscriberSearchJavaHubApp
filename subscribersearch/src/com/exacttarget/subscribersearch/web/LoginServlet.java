package com.exacttarget.subscribersearch.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.minidev.json.JSONObject;

import com.exacttarget.wsdl.partnerapi.Soap;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doWork(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doWork(request, response);
	}
	
	protected void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String jwt = request.getParameter("jwt");
		if (jwt != null && jwt != "") {
			try {
				JSONObject payloadObj = JWTUtil.decode(jwt, PropertiesHelper.getAppProperty("APP_SIGNATURE"));
				JSONObject requestObj = (JSONObject)payloadObj.get("request");
				JSONObject userObj = (JSONObject)requestObj.get("user");
				JSONObject organizationObj = (JSONObject)requestObj.get("organization");
				Object internalOauthToken = userObj.get("internalOauthToken");
				Object stackKeyObj = organizationObj.get("stackKey");
				
				// Create a SOAP client using the oauth token for authentication
				ETClient client = new ETClient();
				System.out.println("internalOauthToken: \n" + internalOauthToken);
				client.setInternalAuthToken(internalOauthToken.toString());
				client.setStack(stackKeyObj.toString());
				Soap soap = client.getSoap();
				
				request.getSession().setAttribute("soap", soap);
				
				response.sendRedirect(request.getContextPath() + "/main");
				return;
				
				
			} catch (Exception e) {
				e.printStackTrace();
				//response.getWriter().print("Unable to decode JWT");
				request.setAttribute("msg", "Unable to decode JWT");
				
			}
		} else {
			request.setAttribute("msg", "NO JWT provided");
			
		}
		
		getServletContext().getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
		
	}

}
