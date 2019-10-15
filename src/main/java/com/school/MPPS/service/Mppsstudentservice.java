package com.school.MPPS.service;

import java.util.List;

import com.school.MPPS.Model.Mppsstudent;


public interface Mppsstudentservice {

public List<Mppsstudent> Listallstudents();
	
	public void addMppsStudent(Mppsstudent MppsStudent);
	
	public void updateMppsStudent(Mppsstudent MppsStudent); 
	
	public void deleteMppsStudent(int id);
	
	public Mppsstudent findMppsStudentById(int id);
}
