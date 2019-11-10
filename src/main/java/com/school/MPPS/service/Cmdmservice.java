package com.school.MPPS.service;

import java.util.List;

import com.school.MPPS.Model.Classmdmrel;

public interface Cmdmservice {

public List<Classmdmrel> ListallCmdmrels();
	public void addClassmdmrel(Classmdmrel Classmdmrel);
	
	
	public Classmdmrel findClassmdmrelById(int id);

}
