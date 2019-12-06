package com.codeblog.cmsapp.serviceimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.codeblog.cmsapp.dao.UserDAO;
import com.codeblog.cmsapp.daoimpl.UserDAOImple;
import com.codeblog.cmsapp.dbutil.DBUtil;
import com.codeblog.cmsapp.domain.User;
import com.codeblog.cmsapp.exception.AuthenticationUSerException;
import com.codeblog.cmsapp.service.UserService;

public class UserServiceImple extends DBUtil implements UserService {

	private UserService userService;
	private UserDAO userDAO = null;

	public UserServiceImple() {
		userDAO = new UserDAOImple();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		user.setRole(userService.USER_ROLE_USER);
		userDAO.save(user);
		System.out.println("regitser user by service");

	}

	@Override
	public User authenticationUser(String loginName, String password) throws AuthenticationUSerException {
		// TODO Auto-generated method stub

		User user = null;

		String sql = "select * from users where loginName = ?  and password= ? ;";

		PreparedStatement preparedStatement = statement(sql);

		System.out.println("query fired");

		try {
			preparedStatement.setString(1, loginName);
			preparedStatement.setString(2, password);

			ResultSet rs = preparedStatement.executeQuery();
			System.out.println("result set");
			if (rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setLoginName(rs.getString("email"));
				user.setLoginName(rs.getString("loginName"));
				user.setPassword(rs.getString("password"));
				System.out.println("in try block");
			} else {
				throw new AuthenticationUSerException("login name or password are wrong...!");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return user;

	}

	@Override
	public void changeUserStatus(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserByProperty(String Property, String Value) {
		// TODO Auto-generated method stub
		return null;
	}

}
