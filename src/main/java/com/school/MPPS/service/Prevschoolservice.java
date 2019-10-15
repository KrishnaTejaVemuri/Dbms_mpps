package com.school.MPPS.service;

import java.util.List;

import com.school.MPPS.Model.Prevschool;

public interface Prevschoolservice {

public List<Prevschool> ListallPrevschools();
	
	public void addPrevschool(Prevschool Prevschool);
	
	public void updatePrevschool(Prevschool Prevschool); 
	
	public void deletePrevschool(int id);
	
	public Prevschool findPrevschoolById(int id);

}
