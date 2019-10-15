package com.school.MPPS.dao;

import java.util.List;

import com.school.MPPS.Model.Scholarship;


public interface Scholarshipdao {
public List<Scholarship> ListallScholarships();
	
	public void addScholarship(Scholarship Scholarship);
	
	public void updateScholarship(Scholarship Scholarship); 
	
	public void deleteScholarship(int id);
	
	public Scholarship findScholarshipById(int id);

}
