package com.codeblog.cmsapp.domain;
/**
 * Person class represent common data of user and contact
 * @author Dhananjay
 *
 */
public class Person {

	/**
	 * Contact id represent unique id.
	 */
	private int id;

	/**
	 * contact name represent name of the contact user.
	 */
	private String name;

	/**
	 * contactNumber represent User contact number.
	 */

	private String contactNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * email represent User email id.
	 */
	private String email;
}
