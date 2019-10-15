package com.school.MPPS.service;

import java.util.List;

import com.school.MPPS.Model.Cashssa;

public interface Cashssaservice {

public List<Cashssa> Listallcashssas();
	
	public void addcashssa(Cashssa cashssa);
	
	public void updatecashssa(Cashssa cashssa); 
	
	public void deletecashssa(int id);
	
	public Cashssa findcashssaById(int id);
}
