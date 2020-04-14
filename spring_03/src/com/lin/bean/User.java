package com.lin.bean;
/*
*@author linone
*/
public class User {
private String username;
private int password;
private String email;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "User [username=" + username + ", password=" + password + ", email=" + email + "]";
}

}
