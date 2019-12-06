package com.codeblog.cmsapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codeblog.cmsapp.domain.Contact;
import com.codeblog.cmsapp.service.ContactService;
import com.codeblog.cmsapp.serviceimpl.ContactServiceImpl;

/**
 * Servlet implementation class ListContactController
 */
@WebServlet("/ListContactController")
public class ListContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ContactService contactService;

	public ListContactController() {
		contactService = new ContactServiceImpl();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user_id = request.getParameter("user_id");
		String name = request.getParameter("name");
		String contactNumber = request.getParameter("contactNumber");
		String email = request.getParameter("email");
		String cgroup = request.getParameter("cgroup");
		String address = request.getParameter("address");

		List<Contact> cont = contactService.allContactListByUserId((int) request.getSession().getAttribute("id"));
		request.setAttribute("contacts", cont);

		getServletContext().getRequestDispatcher("/contactList.jsp?msg=conatct list are as follows").forward(request,
				response);

	}

}
