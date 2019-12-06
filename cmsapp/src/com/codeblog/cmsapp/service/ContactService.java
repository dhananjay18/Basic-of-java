package com.codeblog.cmsapp.service;

import java.util.List;

import com.codeblog.cmsapp.domain.Contact;

/**
 * ContactService interface represent contact related services;
 * @author Dhananjay
 *
 */
public interface ContactService {

	/**
	 * addContact method add the contact information.
	 */
	public void addContact(Contact contact);
	
	/**
	 * allContactListByUserId method represent the list of all conatct
	 * @param object 
	 * @param user_id is parameter which display contact list by id
	 * @return
	 */
	public List<Contact> allContactListByUserId(int id);
	
}
