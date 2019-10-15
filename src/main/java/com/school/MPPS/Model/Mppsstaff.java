package com.school.MPPS.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mppsstaff {

	@Id
	private int staffid;
	private String stname;
	private String work;
	private String staffphone;
	private String gender;
	
	public Mppsstaff(int staffid) {
		super();
		this.staffid = staffid;
	}
	public Mppsstaff() {
		super();
	}
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getStaffphone() {
		return staffphone;
	}
	public void setStaffphone(String staffphone) {
		this.staffphone = staffphone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
