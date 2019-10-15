package com.school.MPPS.dao;

import java.util.List;

import com.school.MPPS.Model.Mppsstudent;


public interface Mppsstudentdao {

	public List<Mppsstudent> Listallstudents();
	
	public void addMppsstudent(Mppsstudent MppsStudent);
	
	public void updateMppsstudent(Mppsstudent MppsStudent); 
	
	public void deleteMppsStudent(int id);
	
	public Mppsstudent findMppsStudentById(int id);
}
