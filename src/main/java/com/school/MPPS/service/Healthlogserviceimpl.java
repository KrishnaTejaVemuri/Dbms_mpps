package com.school.MPPS.service;

import java.util.List;

import com.school.MPPS.Model.Healthlog;
import com.school.MPPS.dao.Healthlogdao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class Healthlogserviceimpl implements Healthlogservice{
@Autowired
Healthlogdao hld;
@Autowired
public Healthlogdao getHld() {
	return hld;
}
@Autowired
public void setHld(Healthlogdao hld) {
	this.hld = hld;
}
@Override
public List<Healthlog> ListallHealthlogs() {
	// TODO Auto-generated method stub
	return hld.ListallHealthlogs();
}
@Override
public void addHealthlog(Healthlog Healthlog) {
	// TODO Auto-generated method stub
	hld.addHealthlog(Healthlog);
}
@Override
public void updateHealthlog(Healthlog Healthlog) {
	// TODO Auto-generated method stub
	hld.updateHealthlog(Healthlog);
}
@Override
public void deleteHealthlog(int id) {
	// TODO Auto-generated method stub
	hld.deleteHealthlog(id);
}
@Override
public Healthlog findHealthlogById(int id) {
	// TODO Auto-generated method stub
	return hld.findHealthlogById(id);
}
@Override
public List<Healthlog> ListstudentHealthlogs(String id) {
	// TODO Auto-generated method stub
	return hld.ListstudentHealthlogs(id);
}
}
