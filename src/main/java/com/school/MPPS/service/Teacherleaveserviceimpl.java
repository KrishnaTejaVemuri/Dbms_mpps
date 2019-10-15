package com.school.MPPS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.Model.Teacherleave;
import com.school.MPPS.dao.Teacherleavedao;

@Service
@Component
public class Teacherleaveserviceimpl implements Teacherleaveservice{
@Autowired
Teacherleavedao tld;
@Autowired
public Teacherleavedao getTld() {
	return tld;
}
@Autowired
public void setTld(Teacherleavedao tld) {
	this.tld = tld;
}
@Override
public List<Teacherleave> ListallTeacherleaves() {
	// TODO Auto-generated method stub
	return tld.ListallTeacherleaves();
}
@Override
public void addTeacherleave(Teacherleave Teacherleave) {
	// TODO Auto-generated method stub
	tld.addTeacherleave(Teacherleave);
}
@Override
public void updateTeacherleave(Teacherleave Teacherleave) {
	// TODO Auto-generated method stub
	tld.updateTeacherleave(Teacherleave);
}
@Override
public void deleteTeacherleave(int id) {
	// TODO Auto-generated method stub
	tld.deleteTeacherleave(id);
}
@Override
public Teacherleave findTeacherleaveById(int id) {
	// TODO Auto-generated method stub
	return tld.findTeacherleaveById(id);
}

}
