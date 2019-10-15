package com.school.MPPS.service;

import java.util.List;

import com.school.MPPS.Model.Mppssubject;

public interface Mppssubjectservice {

	public List<Mppssubject> Listallsubjects();
	
	public void addMppssubject(Mppssubject Mppssubject);
	
	public void updateMppssubject(Mppssubject Mppssubject); 
	
	public void deleteMppssubject(int id);
	
	public Mppssubject findMppssubjectById(int id);
}
