package com.school.MPPS.dao;

import java.util.List;

import com.school.MPPS.Model.Mppsclass;


public interface Mppsclassdao {

public List<Mppsclass> ListallMppsclasss();
	
	public void addMppsclass(Mppsclass Mppsclass);
	
	public void updateMppsclass(Mppsclass Mppsclass); 
	
	public void deleteMppsclass(int id);
	
	public Mppsclass findMppsclassById(int id);
}
