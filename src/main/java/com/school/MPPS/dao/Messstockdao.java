package com.school.MPPS.dao;

import java.util.List;

import com.school.MPPS.Model.Messstock;

public interface Messstockdao {

public List<Messstock> ListallMessstock();
	
	public void addMessstock(Messstock Messstock);
	
	public void updateMessstock(Messstock Messstock); 
	
	public void deleteMessstock(int id);
	
	public Messstock findMessstockById(int id);
}
