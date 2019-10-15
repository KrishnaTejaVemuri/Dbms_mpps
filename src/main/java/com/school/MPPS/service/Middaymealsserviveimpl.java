package com.school.MPPS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.Model.Middaymeals;
import com.school.MPPS.dao.Middaymealsdao;

@Service
@Component
public class Middaymealsserviveimpl implements Middaymealsservice{
@Autowired
Middaymealsdao mmd;
@Autowired
public Middaymealsdao getMmd() {
	return mmd;
}
@Autowired
public void setMmd(Middaymealsdao mmd) {
	this.mmd = mmd;
}
@Override
public List<Middaymeals> ListallMiddaymealss() {
	// TODO Auto-generated method stub
	return mmd.ListallMiddaymealss();
}
@Override
public void addMiddaymeals(Middaymeals Middaymeals) {
	// TODO Auto-generated method stub
	mmd.addMiddaymeals(Middaymeals);
}
@Override
public void updateMiddaymeals(Middaymeals Middaymeals) {
	// TODO Auto-generated method stub
	mmd.updateMiddaymeals(Middaymeals);
}
@Override
public void deleteMiddaymeals(int id) {
	// TODO Auto-generated method stub
	mmd.deleteMiddaymeals(id);
}
@Override
public Middaymeals findMiddaymealsById(int id) {
	// TODO Auto-generated method stub
	return mmd.findMiddaymealsById(id);
}

}
