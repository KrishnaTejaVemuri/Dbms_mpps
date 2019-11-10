package com.school.MPPS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.Model.User;
import com.school.MPPS.dao.Userdao;

@Service
@Component
public class Userserviceimpl implements Userservice{
@Autowired
Userdao ud;
@Autowired
public Userdao getUd() {
	return ud;
}
@Autowired
public void setUd(Userdao ud) {
	this.ud = ud;
}
@Override
public List<User> ListallUsers() {
	// TODO Auto-generated method stub
	return ud.ListallUsers();
}
@Override
public void addUser(User User) {
	// TODO Auto-generated method stub
	ud.addUser(User);
}
@Override
public void updateUser(User User) {
	// TODO Auto-generated method stub
	ud.updateUser(User);
}
@Override
public void deleteUser(int id) {
	// TODO Auto-generated method stub
	ud.deleteUser(id);
}
@Override
public User findUserById(int id) {
	// TODO Auto-generated method stub
	return ud.findUserById(id);
}

}
