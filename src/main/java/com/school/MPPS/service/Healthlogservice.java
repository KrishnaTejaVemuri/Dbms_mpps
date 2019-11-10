package com.school.MPPS.service;

import java.util.List;

import com.school.MPPS.Model.Healthlog;

public interface Healthlogservice {


public List<Healthlog> ListallHealthlogs();
	
	public void addHealthlog(Healthlog Healthlog);
	
	public void updateHealthlog(Healthlog Healthlog); 
	
	public void deleteHealthlog(int id);
	
	public Healthlog findHealthlogById(int id);


public List<Healthlog> ListstudentHealthlogs(String id);
}
