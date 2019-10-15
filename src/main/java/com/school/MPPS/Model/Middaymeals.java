package com.school.MPPS.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Middaymeals {
	@Id
	private int mdmid;
	private int noofstudentsate;
	private String date;
	private int msid;
	private int staffid;
	
	public Middaymeals(int mdmid) {
		super();
		this.mdmid = mdmid;
	}
	public Middaymeals() {
		super();
	}
	public int getMdmid() {
		return mdmid;
	}
	public void setMdmid(int mdmid) {
		this.mdmid = mdmid;
	}
	public int getNoofstudentsate() {
		return noofstudentsate;
	}
	public void setNoofstudentsate(int noofstudentsate) {
		this.noofstudentsate = noofstudentsate;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getMsid() {
		return msid;
	}
	public void setMsid(int msid) {
		this.msid = msid;
	}
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	
}
