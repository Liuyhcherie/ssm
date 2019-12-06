package com.test.bean;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String userid;
	private String username;
	
	public User() {
		super();
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
