package com.school.MPPS.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mppsstudent {
	@Id
	private int mppssid;
	private String firstname;
	private String lastname;
	private int age;
	private String caste;
	private String gender;
	private int classid;
	private int schoolid;
	
	public Mppsstudent(int mppssid) {
		super();
		this.mppssid = mppssid;
	}

	public Mppsstudent() {
		super();
	}

	public int getMppssid() {
		return mppssid;
	}
	
	public void setMppssid(int mppssid) {
		this.mppssid = mppssid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public int getSchoolid() {
		return schoolid;
	}
	public void setSchoolid(int schoolid) {
		this.schoolid = schoolid;
	}
	
}
