package com.school.MPPS.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mppsteacher {

	@Id
	private int mppstid;
	private String firstname;
	private String lastname;
	private int age;
	private String caste;
	private String edq;
	private String cat;
	
	public Mppsteacher(int mppstid) {
		super();
		this.mppstid = mppstid;
	}
	public Mppsteacher() {
		super();
	}
	public int getMppstid() {
		return mppstid;
	}
	public void setMppstid(int mppstid) {
		this.mppstid = mppstid;
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
	public String getEdq() {
		return edq;
	}
	public void setEdq(String edq) {
		this.edq = edq;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	
}
