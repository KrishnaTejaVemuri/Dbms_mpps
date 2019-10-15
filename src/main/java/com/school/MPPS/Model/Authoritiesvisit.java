package com.school.MPPS.Model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Authoritiesvisit {

	@Id
	private int auid;
	private String designation;
	private String authname;
	private String dov;
	private String remarks;
	
	public Authoritiesvisit(int auid) {
		super();
		this.auid = auid;
	}
	public Authoritiesvisit() {
		super();
	}
	public int getAuid() {
		return auid;
	}
	public void setAuid(int auid) {
		this.auid = auid;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAuthname() {
		return authname;
	}
	public void setAuthname(String authname) {
		this.authname = authname;
	}
	public String getDov() {
		return dov;
	}
	public void setDov(String dov) {
		this.dov = dov;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
