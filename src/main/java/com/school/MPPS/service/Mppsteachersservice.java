package com.school.MPPS.service;

import java.util.List;

import com.school.MPPS.Model.Mppsteacher;


public interface Mppsteachersservice {

public List<Mppsteacher> Listallteachers();
	
	public void addMppsteacher(Mppsteacher Mppsteacher);
	
	public void updateMppsteacher(Mppsteacher Mppsteacher); 
	
	public void deleteMppsteacher(int id);
	
	public Mppsteacher findMppsteacherById(int id);
}
