package com.codeblog.cmsapp.test;

import com.codeblog.cmsapp.domain.User;
import com.codeblog.cmsapp.exception.AuthenticationUSerException;
import com.codeblog.cmsapp.service.UserService;
import com.codeblog.cmsapp.serviceimpl.UserServiceImple;

public class UserServiceImpl_UserAuthenticationTest {

	public static void main(String[] args) throws AuthenticationUSerException {
		// TODO Auto-generated method stub

		UserService userService=new UserServiceImple();
		User use=userService.authenticationUser("abhijeet", "abhi123");
		System.out.println(use.getName());
		
	}

}

