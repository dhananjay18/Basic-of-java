package com.codeblog.cmsapp.domain;

/**
 * This User pojo class represent user related data;
 * @author Dhananjay
 *
 */
public class User extends Person{

	
	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	/**
	 * role represent user role.If(admin=1,user=2)
	 */
	private int role;
	
	/**
	 * status represent user Status.
	 */
	private String status;
	
	/**
	 * loginName represent login access to the user.
	 */
	private String loginName;
	
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
