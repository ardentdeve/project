package project;

import java.util.*;

public class User {

	private String password;
	private String username;
	private String firstName;
	private String lastName;
	private char type;
	private char status;
	
	public User(String pw, String un, String firstName, String lastName, char type, char status) {
		this.password = pw;
		this.username = un;
		this.firstName = firstName;
		this.lastName = lastName;
		this.type = type;
		this.status = status;
	}
	
	public void logOn() {
		logOn(username, password); //???????????????????/
	}
	
	public void logOff() {
		//????????????????????????????????????????????????????????
	}
	
	//FIRST NAME
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//LAST NAME
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	//USERNAME
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	//PASSWORD
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	//TYPE
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
}
