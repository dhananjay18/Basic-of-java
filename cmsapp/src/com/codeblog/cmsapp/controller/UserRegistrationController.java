package com.codeblog.cmsapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codeblog.cmsapp.domain.User;
import com.codeblog.cmsapp.service.UserService;
import com.codeblog.cmsapp.serviceimpl.UserServiceImple;

/**
 * Servlet implementation class UserRegistrationController
 */
@WebServlet("/UserRegistrationController")
public class UserRegistrationController extends HttpServlet {

	private UserService userService;
	
	public UserRegistrationController() {
        // TODO Auto-generated constructor stub
		userService=new UserServiceImple();
    }
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		User user=new User();
		
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		user.setLoginName(request.getParameter("loginName"));
		user.setPassword(request.getParameter("password"));
		userService.registerUser(user);
		
		//getServletContext().getRequestDispatcher().forward(request, response);
		response.sendRedirect("./signin.jsp?msg=Register successfully");
		out.println("register successfully");
		
		
	}

}
