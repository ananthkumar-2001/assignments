package io.mvcAssignments;

import javax.validation.constraints.Email;

public class userModel {

	private String userName;
	
	private String password;
	
	private Email email;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	} 
	
}
