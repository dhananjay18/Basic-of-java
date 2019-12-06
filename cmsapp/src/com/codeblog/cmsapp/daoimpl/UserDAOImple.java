package com.codeblog.cmsapp.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import com.codeblog.cmsapp.dao.UserDAO;
import com.codeblog.cmsapp.dbutil.DBUtil;
import com.codeblog.cmsapp.domain.User;
import com.mysql.cj.protocol.Resultset;

/**
 * UserDAOImple represent the implementation of all abstarct method
 * @author Dhananjay
 *
 */
public class UserDAOImple extends DBUtil implements UserDAO {

	@Override
	public void save(User user) {
		
		String sql="insert into users (name,contactNumber,email,role,status,loginName,password) values (?,?,?,?,?,?,?);";
		
		PreparedStatement preparedStatement=statement(sql);
		
		try {
			//preparedStatement.setInt(1, user.getId());
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getContactNumber());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setInt(4, user.getRole());
			preparedStatement.setString(5, user.getStatus());
			preparedStatement.setString(6, user.getLoginName());
			preparedStatement.setString(7, user.getPassword());
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

	@Override
	public void delete(int id) {
		
		String sql="delete from users where id=?;";
		
		PreparedStatement preparedStatment=statement(sql);
		
		try {
			preparedStatment.setInt(1, id);
			preparedStatment.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void delete(User user) {

		delete(user.getId());
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
		String sql ="update users set name='AAVV' where id=?;";
		
		PreparedStatement preparedStatement=statement(sql);
		
		try {
			preparedStatement.setInt(1,user.getId());
			//preparedStatement.setString(2,user.getName());
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return user;
	}

	@Override
	public List<User> list() {
		List<User> users=new ArrayList<>();
		User user=new User();
		String sql="select * from users;";
		PreparedStatement stmt=statement(sql);
		
		try {
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				user=new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setContactNumber(rs.getString("contactNumber"));
				user.setRole(rs.getInt("role"));
				user.setStatus(rs.getString("status"));
				user.setLoginName(rs.getString("loginName"));
				user.setPassword(rs.getString("password"));
				
				users.add(user);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}

}
