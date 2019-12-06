 package com.codeblog.cmsapp.service;

import java.util.List;

import com.codeblog.cmsapp.domain.User;
import com.codeblog.cmsapp.exception.AuthenticationUSerException;

public interface UserService {

	int USER_STATUS_ACTIVE=1;
	int USER_STATUS_BLOCKED=2;
	
	int USER_ROLE_ADMIN=1;
	int USER_ROLE_USER=2;
	
	public void registerUser(User user);
	public User authenticationUser(String loginName,String password) throws AuthenticationUSerException;
	public void changeUserStatus(int id);
	public List<User> getAllUser();
	public List<User> getUserByProperty(String Property,String Value);
}
