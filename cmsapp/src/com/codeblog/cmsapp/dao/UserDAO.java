package com.codeblog.cmsapp.dao;

import java.util.List;

import com.codeblog.cmsapp.domain.User;

/**
 * UserDAO represent CRUD operation of user
 * @author Dhananjay
 *
 */
public interface UserDAO {

	/**
	 * save method represent insert operation for user.
	 * @param user
	 */
	public void save(User user);
	
	/**
	 * delete method represent delete the user by id.
	 * @param id
	 */
	public void delete(int id);
	
	/**
	 * delete method represent delete the user by user name;
	 * @param user
	 */
	public void delete(User user);
	
	/**
	 * update method  represent update user data by user name.
	 * @param user
	 */
	public void update(User user);
	
	/**
	 * list method represent all data of user.
	 * @return
	 */
	public List<User> list();
}
