package com.codeblog.cmsapp.test;

import com.codeblog.cmsapp.dao.UserDAO;
import com.codeblog.cmsapp.daoimpl.UserDAOImple;
import com.codeblog.cmsapp.domain.User;
import com.codeblog.cmsapp.service.UserService;
import com.codeblog.cmsapp.serviceimpl.UserServiceImple;

public class UserDAOImple_saveOperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user=new User();
		UserDAO userDAO=new UserDAOImple();
		
		UserService userService=new UserServiceImple();
		
		
		user.setName("uday");
		user.setContactNumber("w4342432");
		user.setEmail("uday@gmail.com");
		//user.setRole(UserService.USER_ROLE_ADMIN);
		user.setStatus("active");
		user.setLoginName("tgtgt");
		user.setPassword("uday@@@");
		userService.registerUser(user);
		
		System.out.println("adding data successfully");
		
		
	}

}
