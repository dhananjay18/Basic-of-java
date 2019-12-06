package com.codeblog.cmsapp.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.codeblog.cmsapp.dao.ContactDAO;
import com.codeblog.cmsapp.dbutil.DBUtil;
import com.codeblog.cmsapp.domain.Contact;
import com.codeblog.cmsapp.domain.User;

/**
 * ContactDAOImpl represent CRUD operation implementation.
 * 
 * @author Dhananjay
 *
 */
public class ContactDAOImpl extends DBUtil implements ContactDAO {

	@Override
	public void save(Contact contact) {
		// TODO Auto-generated method stub

		String sql = "insert into contacts(user_id,name,contactNumber,email,cgroup,address) values(?,?,?,?,?,?)";
		PreparedStatement preparedStatement = statement(sql);

		try {
			preparedStatement.setInt(1, contact.getUser_id());
			preparedStatement.setString(2, contact.getName());
			preparedStatement.setString(3, contact.getContactNumber());
			preparedStatement.setString(4, contact.getEmail());
			preparedStatement.setString(5, contact.getcGroup());
			preparedStatement.setString(6, contact.getAddress());
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Contact> list(int id) {
		
		System.out.println("starting dao layer");
		List<Contact> contacts=new ArrayList<>();
		Contact contact;
		String sql="select * from contacts where user_id=? ;";
		PreparedStatement stmt=statement(sql);
		
		try {
			stmt.setInt(1, id);
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				contact=new Contact();
				contact.setUser_id(rs.getInt("user_id"));
				contacts.add(contact);
				System.out.println("ending dao layer");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contacts;
	}

}
