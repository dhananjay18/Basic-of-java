package com.codeblog.cmsapp.test;

import com.codeblog.cmsapp.dao.UserDAO;
import com.codeblog.cmsapp.daoimpl.UserDAOImple;
import com.codeblog.cmsapp.domain.User;

public class UserDAOImple_DeleteOpearationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user=new User();
		UserDAO userDAO=new UserDAOImple();
		
		userDAO.delete(2);
		
		System.out.println("deleted successfully");
	}

}
