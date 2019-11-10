package com.school.MPPS.dao;

import java.util.List;

import com.school.MPPS.Model.Examsubjectrel;


public interface Examsubjectreldao {

public List<Examsubjectrel> ListallExamsubjectrels();
	
	public void addExamsubjectrel(Examsubjectrel Examsubjectrel);
	
	
	public Examsubjectrel findExamsubjectrelById(int id);
}
