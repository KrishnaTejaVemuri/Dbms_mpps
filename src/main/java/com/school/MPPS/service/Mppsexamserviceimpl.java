package com.school.MPPS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.Model.Mppsexam;
import com.school.MPPS.dao.Mppsexamdao;

@Service
@Component
public class Mppsexamserviceimpl implements Mppsexamservice{
@Autowired
Mppsexamdao med;
@Autowired
public Mppsexamdao getMed() {
	return med;
}
@Autowired
public void setMed(Mppsexamdao med) {
	this.med = med;
}
@Override
public List<Mppsexam> ListallMppsexams() {
	// TODO Auto-generated method stub
	return med.ListallMppsexams();
}
@Override
public void addMppsexam(Mppsexam Mppsexam) {
	// TODO Auto-generated method stub
	med.addMppsexam(Mppsexam);
}
@Override
public void updateMppsexam(Mppsexam Mppsexam) {
	// TODO Auto-generated method stub
	med.updateMppsexam(Mppsexam);
}
@Override
public void deleteMppsexam(int id) {
	// TODO Auto-generated method stub
	med.deleteMppsexam(id);
}
@Override
public Mppsexam findMppsexamById(int id) {
	// TODO Auto-generated method stub
	return med.findMppsexamById(id);
}

}
