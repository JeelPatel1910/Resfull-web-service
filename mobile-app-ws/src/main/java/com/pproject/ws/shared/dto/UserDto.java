package com.pproject.ws.shared.dto;

import java.io.Serializable;

public class UserDto implements Serializable{

	private static final long serialVersionUID = 7864093348259950672L;
	private String id;  
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String encryptedPassword;
	private String emailVarificationCode;
	private Boolean emailVarificationStatus=false;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	public String getEmailVarificationCode() {
		return emailVarificationCode;
	}
	public void setEmailVarificationCode(String emailVarificationCode) {
		this.emailVarificationCode = emailVarificationCode;
	}
	public Boolean getEmailVarificationStatus() {
		return emailVarificationStatus;
	}
	public void setEmailVarificationStatus(Boolean emailVarificationStatus) {
		this.emailVarificationStatus = emailVarificationStatus;
	}
	
	
}
