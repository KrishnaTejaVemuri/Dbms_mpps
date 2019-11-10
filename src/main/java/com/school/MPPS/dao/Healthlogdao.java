package com.school.MPPS.dao;

import java.util.List;

import com.school.MPPS.Model.Healthlog;


public interface Healthlogdao {

public List<Healthlog> ListallHealthlogs();
	
	public void addHealthlog(Healthlog Healthlog);
	
	public void updateHealthlog(Healthlog Healthlog); 
	
	public void deleteHealthlog(int id);
	
	public Healthlog findHealthlogById(int id);

public List<Healthlog> ListstudentHealthlogs(String id);
}
