package com.school.MPPS.service;

import java.util.List;

import com.school.MPPS.Model.Gaurdian;

public interface Gaurdianservice {

public List<Gaurdian> ListallGaurdians();
	
	public void addGaurdian(Gaurdian Gaurdian);
	
	public void updateGaurdian(Gaurdian Gaurdian); 
	
	public void deleteGaurdian(int id);
	
	public Gaurdian findGaurdianById(int id);
}
