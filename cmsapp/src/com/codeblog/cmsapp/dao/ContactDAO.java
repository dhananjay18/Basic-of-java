package com.codeblog.cmsapp.dao;

import java.util.List;

import com.codeblog.cmsapp.domain.Contact;
/**
 * contactDAO interface represent CRUD operation of contact.
 * @author Dhananjay
 *
 */
public interface ContactDAO {

	public void save(Contact conatct);
	
	public List<Contact> list(int id);
	
}
