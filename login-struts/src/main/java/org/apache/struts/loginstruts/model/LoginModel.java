package org.apache.struts.loginstruts.model;

public class LoginModel {
	
	private String username;
	private String password;
	
	public LoginModel(String username, String password) {
		setUsername(username);
		setPassword(password);
	}
	
	public LoginModel() {
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

}