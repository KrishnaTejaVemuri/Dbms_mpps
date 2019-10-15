package com.school.MPPS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.Model.Mppsstudent;
import com.school.MPPS.dao.Mppsstudentdao;
@Service
@Component
public class Mppsstudentserviceimpl implements Mppsstudentservice{
@Autowired
Mppsstudentdao msd;
@Autowired
public Mppsstudentdao getMsd() {
	return msd;
}

@Autowired
public void setMsd(Mppsstudentdao msd) {
	this.msd = msd;
}

@Override
public List<Mppsstudent> Listallstudents() {
	// TODO Auto-generated method stub
	return msd.Listallstudents();
}

@Override
public void addMppsStudent(Mppsstudent MppsStudent) {
	// TODO Auto-generated method stub
	msd.addMppsstudent(MppsStudent);
}

@Override
public void updateMppsStudent(Mppsstudent MppsStudent) {
	// TODO Auto-generated method stub
	msd.updateMppsstudent(MppsStudent);
}

@Override
public void deleteMppsStudent(int id) {
	// TODO Auto-generated method stub
	msd.deleteMppsStudent(id);
}

@Override
public Mppsstudent findMppsStudentById(int id) {
	// TODO Auto-generated method stub
	return msd.findMppsStudentById(id);
}

}
