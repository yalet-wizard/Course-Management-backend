package com.java.coursesystem.dto;

public class UserLoginDto {

	private String name;
	private String password;
	 
	public UserLoginDto(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public UserLoginDto() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
