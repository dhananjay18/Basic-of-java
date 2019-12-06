package com.codeblog.cmsapp.domain;

/**
 * Contact pojo class represent contact data of user.
 * 
 * @author Dhananjay
 *
 */
public class Contact extends Person {

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getcGroup() {
		return cGroup;
	}

	public void setcGroup(String cGroup) {
		this.cGroup = cGroup;
	}

	/**
	 * user_id represent refrence by user
	 */

	private int user_id;

	/**
	 * cGroup represent contact group of user.
	 */

	private String cGroup;
	/**
	 * address represent persons personal location.
	 */
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
