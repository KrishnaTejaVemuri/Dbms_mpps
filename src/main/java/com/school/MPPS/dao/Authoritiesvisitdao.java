package com.school.MPPS.dao;

import java.util.List;

import com.school.MPPS.Model.Authoritiesvisit;


public interface Authoritiesvisitdao {

	public List<Authoritiesvisit> Listallvisits();
	
	public void addAuthoritiesvisit(Authoritiesvisit Authoritiesvisit);
	
	public void updateAuthoritiesvisit(Authoritiesvisit Authoritiesvisit); 
	
	public void deleteAuthoritiesvisit(int id);
	
	public Authoritiesvisit findAuthoritiesvisitById(int id);
}
