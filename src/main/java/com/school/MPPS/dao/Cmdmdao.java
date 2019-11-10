package com.school.MPPS.dao;

import java.util.List;

import com.school.MPPS.Model.Classmdmrel;

public interface Cmdmdao {

public List<Classmdmrel> ListallCmdmrels();
	public void addClassmdmrel(Classmdmrel Classmdmrel);
	
	
	public Classmdmrel findClassmdmrelById(int id);
}
