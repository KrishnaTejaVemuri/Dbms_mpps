package com.school.MPPS.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Prevschool {
	@Id
	private int schoolid;
	private	String schoolname;
	private	String contactno;
	
	public Prevschool(int schoolid) {
		super();
		this.schoolid = schoolid;
	}
	public Prevschool() {
		super();
	}
	public int getSchoolid() {
		return schoolid;
	}
	public void setSchoolid(int schoolid) {
		this.schoolid = schoolid;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	
	
}
