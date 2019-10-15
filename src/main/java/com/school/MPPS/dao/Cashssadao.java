package com.school.MPPS.dao;

import java.util.List;

import com.school.MPPS.Model.Cashssa;


public interface Cashssadao {
public List<Cashssa> Listallcashssas();
	
	public void addcashssa(Cashssa cashssa);
	
	public void updatecashssa(Cashssa cashssa); 
	
	public void deletecashssa(int id);
	
	public Cashssa findcashssaById(int id);
}
