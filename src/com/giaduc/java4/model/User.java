package com.giaduc.java4.model;

public class User {

	private String userName;
	private String password;

	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public User() {
		super();
	}

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
	
	public boolean checkLogin(String userName, String password) {
		if (userName.equals("giaduc") && password.equals("1111")) {
			return true;
		} else {
			return false;
		}
	}

}
