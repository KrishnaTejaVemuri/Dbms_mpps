package com.school.MPPS.dao;

import java.util.List;

import com.school.MPPS.Model.User;

public interface Userdao {

public List<User> ListallUsers();
	
	public void addUser(User User);
	
	public void updateUser(User User); 
	
	public void deleteUser(int id);
	
	public User findUserById(int id);
}
