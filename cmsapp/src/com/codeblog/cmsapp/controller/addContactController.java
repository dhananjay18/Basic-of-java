package com.codeblog.cmsapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codeblog.cmsapp.domain.Contact;
import com.codeblog.cmsapp.service.ContactService;
import com.codeblog.cmsapp.serviceimpl.ContactServiceImpl;

/**
 * Servlet implementation class addContactController
 */
@WebServlet("/addContactController")
public class addContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ContactService contactService;

	public addContactController() {
		contactService = new ContactServiceImpl();
		// TODO Auto-generated constructor stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		Contact contact = new Contact();
		PrintWriter out = response.getWriter();
		contact.setUser_id((int) request.getSession().getAttribute("id"));
		contact.setName(request.getParameter("name"));
		contact.setContactNumber(request.getParameter("contactNumber"));
		contact.setEmail(request.getParameter("email"));
		contact.setcGroup(request.getParameter("cgroup"));
		contact.setAddress(request.getParameter("address"));

		
		contactService.addContact(contact);
		out.println("data send to service  layer");
		RequestDispatcher rd=request.getRequestDispatcher("ListContactController");
		rd.forward(request, response);    
		

	}

}
