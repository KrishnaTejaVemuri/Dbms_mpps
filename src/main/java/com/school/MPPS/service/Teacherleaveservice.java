package com.school.MPPS.service;

import java.util.List;

import com.school.MPPS.Model.Teacherleave;

public interface Teacherleaveservice {

public List<Teacherleave> ListallTeacherleaves();
	
	public void addTeacherleave(Teacherleave Teacherleave);
	
	public void updateTeacherleave(Teacherleave Teacherleave); 
	
	public void deleteTeacherleave(int id);
	
	public Teacherleave findTeacherleaveById(int id);
}
