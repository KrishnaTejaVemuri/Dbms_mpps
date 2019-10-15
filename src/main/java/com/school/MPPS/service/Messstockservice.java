package com.school.MPPS.service;

import java.util.List;

import com.school.MPPS.Model.Messstock;

public interface Messstockservice {

public List<Messstock> ListallMessstock();
	
	public void addMessstock(Messstock Messstock);
	
	public void updateMessstock(Messstock Messstock); 
	
	public void deleteMessstock(int id);
	
	public Messstock findMessstockById(int id);
}
