package com.javatechie.group.entity;

public class LoginClass {
	private String userName;
	private String userPassword;
	public LoginClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginClass(String username, String password) {
		super();
		this.userName = username;
		this.userPassword = password;
	}
	public String getUsername() {
		return userName;
	}
	public void setUsername(String username) {
		this.userName = username;
	}
	public String getPassword() {
		return userPassword;
	}
	public void setPassword(String password) {
		this.userPassword = password;
	}
	
}
