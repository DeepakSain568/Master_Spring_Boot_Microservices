package com.LearnSpringBoot.first.DTO;

public class RequestDTO {
	
	String username;
	String email;
	String password;
	
public	RequestDTO(String username,String email,String password){
		this.username = username;
		this.email = email;
		this.password = password;
		
	}
	
public	String getUserName() {
		return username;
	}
	
public	String getEmail() {
		return email;
	}
	
public	String getPassword() {
		return password;
	}
	
public	void setUsername(String val) {
		username = val;
	}
public	void setEmail(String val) {
		email = val;
	}
public	void SetPassword(String val) {
		password = val;
	}
	

}
