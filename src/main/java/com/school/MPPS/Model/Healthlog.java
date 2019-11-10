package com.school.MPPS.Model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Healthlog {

@Id
private int checkupid;
private String problem;
private String date;
private int sid;

public Healthlog(int checkupid) {
	super();
	this.checkupid = checkupid;
}

public Healthlog() {
	super();
}
public int getCheckupid() {
	return checkupid;
}
public void setCheckupid(int checkupid) {
	this.checkupid = checkupid;
}
public String getProblem() {
	return problem;
}
public void setProblem(String problem) {
	this.problem = problem;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}

	public Healthlog(String sid) {
		this.sid = Integer.parseInt(sid);
	}

}
