package com.school.MPPS.service;

import java.util.List;

import com.school.MPPS.Model.Mppsexam;

public interface Mppsexamservice {


public List<Mppsexam> ListallMppsexams();
	
	public void addMppsexam(Mppsexam Mppsexam);
	
	public void updateMppsexam(Mppsexam Mppsexam); 
	
	public void deleteMppsexam(int id);
	
	public Mppsexam findMppsexamById(int id);
}
