package io.mvcAssignments;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

	@NotEmpty(message = "username can not be neither empty nor null")
	@Size(min=8,max=20,message = "Size of username must be min 8 and max 20")
	@Pattern(regexp="^[a-zA-Z0-9]",message = "Should not contain space")
	private String userName;
	
	@NotEmpty(message = "password can not be empty")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$",message = "Password should contain at least one uppercase letter, lower-case letter, a digit or special character (_, $, #, ., @). Password should \r\n"
			+ "also be 8 to 20 characters long.")
	private String password;
	
	@NotEmpty(message = "email can not be empty")
	private String email;
	
	@IsValidContact
	private long contact;
	
	@NotNull(message = "city must be selcted")
	private String city;
	
	@NotNull(message = "zipcode can not be null")
	@Max(999999)
	private long zipCode;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	
	
}
