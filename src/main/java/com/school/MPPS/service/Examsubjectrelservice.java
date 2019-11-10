package com.school.MPPS.service;

import java.util.List;

import com.school.MPPS.Model.Examsubjectrel;

public interface Examsubjectrelservice {

public List<Examsubjectrel> ListallExamsubjectrels();
	
	public void addExamsubjectrel(Examsubjectrel Examsubjectrel);
	
	
	public Examsubjectrel findExamsubjectrelById(int id);
}
