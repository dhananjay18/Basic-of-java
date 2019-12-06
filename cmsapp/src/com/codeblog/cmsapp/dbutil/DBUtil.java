package com.codeblog.cmsapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * DBUtil class represent connection code to mysql.
 * 
 * @author Dhananjay
 *
 */
public class DBUtil {

	private Connection connection = null;

	private PreparedStatement preparedStatement;

	static {
		try {
			Class c = Class.forName("com.mysql.jdbc.Driver");
			System.out.println(c);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Connection connect() {

		String url = "jdbc:mysql://localhost:3306/cmsapp";
		try {
			 System.out.println("(((");
			connection = DriverManager.getConnection(url, "root", "root");
			System.out.println(connection);
			 System.out.println("&&&&&");

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return connection;

	}

	public PreparedStatement statement(String sql) {
		try {
			System.out.println("******");
			preparedStatement = connect().prepareStatement(sql);
			System.out.println("----");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preparedStatement;

	}
}
