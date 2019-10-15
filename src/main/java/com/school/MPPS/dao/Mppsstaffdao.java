package com.school.MPPS.dao;

import java.util.List;

import com.school.MPPS.Model.Mppsstaff;


public interface Mppsstaffdao {

	public List<Mppsstaff> Listallstaffs();
	
	public void addMppsstaff(Mppsstaff Mppsstaff);
	
	public void updateMppsstaff(Mppsstaff Mppsstaff); 
	
	public void deleteMppsstaff(int id);
	
	public Mppsstaff findMppsstaffById(int id);
}
