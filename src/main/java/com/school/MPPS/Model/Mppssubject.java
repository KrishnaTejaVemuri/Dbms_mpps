package com.school.MPPS.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Mppssubject {
	@Id
	private int subid;
	private String subjectname;
	private int classid;
	private int mppstid;
	
	public Mppssubject(int subid) {
		super();
		this.subid = subid;
	}
	public Mppssubject() {
		super();
	}
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public int getMppstid() {
		return mppstid;
	}
	public void setMppstid(int mppstid) {
		this.mppstid = mppstid;
	}
	
	
	
}
