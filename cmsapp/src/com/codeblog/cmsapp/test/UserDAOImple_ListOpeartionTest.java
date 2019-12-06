package com.codeblog.cmsapp.test;

import java.util.List;

import com.codeblog.cmsapp.dao.UserDAO;
import com.codeblog.cmsapp.daoimpl.UserDAOImple;
import com.codeblog.cmsapp.domain.User;

public class UserDAOImple_ListOpeartionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User();
		UserDAO userDAO=new UserDAOImple();
		
		List<User> users=userDAO.list();
		
		for (User u : users) {
			
			System.out.println("NAME :"+	u.getName());
			System.out.println("LOGIN NAME :"+	u.getLoginName());
			
			System.out.println("-----");
		}

	}

}
