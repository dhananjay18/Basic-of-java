package com.codeblog.cmsapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codeblog.cmsapp.domain.User;
import com.codeblog.cmsapp.exception.AuthenticationUSerException;
import com.codeblog.cmsapp.service.UserService;
import com.codeblog.cmsapp.serviceimpl.UserServiceImple;

/**
 * Servlet implementation class UserAunthenticationController
 */
@WebServlet("/UserAunthenticationController")
public class UserAunthenticationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService userService;

	public UserAunthenticationController() {
        // TODO Auto-generated constructor stub
		userService=new UserServiceImple();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String loginName = request.getParameter("loginName");
		String password = request.getParameter("password");

		try {
			User login=userService.authenticationUser(loginName, password);
			System.out.println("going to service layer");
			HttpSession session=request.getSession();
			session.setAttribute("name", login.getLoginName());
			session.setAttribute("id", login.getId());
			response.sendRedirect("./userDashbord.jsp?msg=hello user");
			
		} catch (AuthenticationUSerException e) {
			// TODO Auto-generated catch block
			response.sendRedirect("./signin.jsp?msg="+e.getMessage());
		}
	}

}
