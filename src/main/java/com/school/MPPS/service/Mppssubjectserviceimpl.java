package com.school.MPPS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.Model.Mppssubject;
import com.school.MPPS.dao.Mppssubjectdao;

@Service
@Component
public class Mppssubjectserviceimpl implements Mppssubjectservice{
@Autowired
Mppssubjectdao msjd;
@Autowired
public Mppssubjectdao getMsjd() {
	return msjd;
}
@Autowired
public void setMsjd(Mppssubjectdao msjd) {
	this.msjd = msjd;
}
@Override
public List<Mppssubject> Listallsubjects() {
	// TODO Auto-generated method stub
	return msjd.Listallsubjects();
}
@Override
public void addMppssubject(Mppssubject Mppssubject) {
	// TODO Auto-generated method stub
	msjd.addMppssubject(Mppssubject);
}
@Override
public void updateMppssubject(Mppssubject Mppssubject) {
	// TODO Auto-generated method stub
	msjd.updateMppssubject(Mppssubject);
}
@Override
public void deleteMppssubject(int id) {
	// TODO Auto-generated method stub
	msjd.deleteMppssubject(id);
}
@Override
public Mppssubject findMppssubjectById(int id) {
	// TODO Auto-generated method stub
	return msjd.findMppssubjectById(id);
}

}
