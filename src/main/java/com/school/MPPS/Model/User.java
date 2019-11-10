package com.school.MPPS.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
@Id
private int id;
private String username;
private String password;
private int active;
private String role;

public User() {
	super();
}
public User(int id) {
	super();
	this.id = id;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public int getActive() {
	return active;
}
public void setActive(int active) {
	this.active = active;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

}
