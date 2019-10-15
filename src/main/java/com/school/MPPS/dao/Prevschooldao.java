package com.school.MPPS.dao;

import java.util.List;

import com.school.MPPS.Model.Prevschool;


public interface Prevschooldao {

public List<Prevschool> ListallPrevschools();
	
	public void addPrevschool(Prevschool Prevschool);
	
	public void updatePrevschool(Prevschool Prevschool); 
	
	public void deletePrevschool(int id);
	
	public Prevschool findPrevschoolById(int id);
}
