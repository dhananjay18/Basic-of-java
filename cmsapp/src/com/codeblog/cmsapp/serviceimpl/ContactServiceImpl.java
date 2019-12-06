package com.codeblog.cmsapp.serviceimpl;

import java.util.List;

import com.codeblog.cmsapp.dao.ContactDAO;
import com.codeblog.cmsapp.daoimpl.ContactDAOImpl;
import com.codeblog.cmsapp.domain.Contact;
import com.codeblog.cmsapp.service.ContactService;

public class ContactServiceImpl implements ContactService{

	private ContactDAO contactDAO;
	
	public ContactServiceImpl() {
		
		contactDAO=new ContactDAOImpl();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addContact(Contact contact) {
		// TODO Auto-generated method stub
		
		contactDAO.save(contact);
		
		
	}

	@Override
	public List<Contact> allContactListByUserId(int id) {
		System.out.println("in list service");
		
		return contactDAO.list(id);
	}

}
