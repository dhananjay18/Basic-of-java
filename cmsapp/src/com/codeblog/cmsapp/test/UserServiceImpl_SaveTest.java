package com.codeblog.cmsapp.test;

import com.codeblog.cmsapp.dao.UserDAO;
import com.codeblog.cmsapp.daoimpl.UserDAOImple;
import com.codeblog.cmsapp.domain.User;
import com.codeblog.cmsapp.service.UserService;
import com.codeblog.cmsapp.serviceimpl.UserServiceImple;

public class UserServiceImpl_SaveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user=null;
		
		UserService userService=new UserServiceImple();
		
		
		user.setEmail("udaywagh@gmail.com");
		user.setLoginName("uday111");
		user.setPassword("uday@123");
		userService.registerUser(user);
		
		System.out.println("user role done by save");
		
	}

}
