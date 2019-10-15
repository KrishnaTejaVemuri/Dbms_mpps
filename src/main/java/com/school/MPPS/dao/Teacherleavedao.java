package com.school.MPPS.dao;

import java.util.List;

import com.school.MPPS.Model.Teacherleave;


public interface Teacherleavedao {

public List<Teacherleave> ListallTeacherleaves();
	
	public void addTeacherleave(Teacherleave Teacherleave);
	
	public void updateTeacherleave(Teacherleave Teacherleave); 
	
	public void deleteTeacherleave(int id);
	
	public Teacherleave findTeacherleaveById(int id);
}
