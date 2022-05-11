package com;


import com.Billing;
import java.io.IOException; 
import java.util.HashMap; 
import java.util.Map; 
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BillingService")
public class BillingService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Billing billingObj = new Billing();

    public BillingService() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String output = billingObj.insertBilling(request.getParameter("bAcc"),      
				request.getParameter("bName"),
				request.getParameter("bUsage"),
				request.getParameter("bAmount")); 
				response.getWriter().write(output);
	}

}
