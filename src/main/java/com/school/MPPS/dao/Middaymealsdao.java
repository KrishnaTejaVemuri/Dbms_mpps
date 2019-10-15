package com.school.MPPS.dao;

import java.util.List;

import com.school.MPPS.Model.Middaymeals;


public interface Middaymealsdao {

public List<Middaymeals> ListallMiddaymealss();
	
	public void addMiddaymeals(Middaymeals Middaymeals);
	
	public void updateMiddaymeals(Middaymeals Middaymeals); 
	
	public void deleteMiddaymeals(int id);
	
	public Middaymeals findMiddaymealsById(int id);
}
