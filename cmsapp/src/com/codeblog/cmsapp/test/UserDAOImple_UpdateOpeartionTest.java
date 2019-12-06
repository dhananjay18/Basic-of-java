package com.codeblog.cmsapp.test;

import com.codeblog.cmsapp.dao.UserDAO;
import com.codeblog.cmsapp.daoimpl.UserDAOImple;
import com.codeblog.cmsapp.domain.User;

public class UserDAOImple_UpdateOpeartionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		UserDAO userDAO = new UserDAOImple();

		/*
		 * user.setId(1); user.setName("HELLO");
		 */
		
		
		user.setId(1);
		//user.setName("APPLEtree");
		userDAO.update(user);
		System.out.println("updated successfully");

	}

}
