package com.school.MPPS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.Model.Scholarship;
import com.school.MPPS.dao.Scholarshipdao;

@Service
@Component
public class Scholarshipserviceimpl implements Scholarshipservice{
@Autowired
Scholarshipdao sd;
@Autowired
public Scholarshipdao getSd() {
	return sd;
}
@Autowired
public void setSd(Scholarshipdao sd) {
	this.sd = sd;
}
@Override
public List<Scholarship> ListallScholarships() {
	// TODO Auto-generated method stub
	return sd.ListallScholarships();
}
@Override
public void addScholarship(Scholarship Scholarship) {
	// TODO Auto-generated method stub
	sd.addScholarship(Scholarship);
}
@Override
public void updateScholarship(Scholarship Scholarship) {
	// TODO Auto-generated method stub
	sd.updateScholarship(Scholarship);
}
@Override
public void deleteScholarship(int id) {
	// TODO Auto-generated method stub
	sd.deleteScholarship(id);
}
@Override
public Scholarship findScholarshipById(int id) {
	// TODO Auto-generated method stub
	return sd.findScholarshipById(id);
}


}
