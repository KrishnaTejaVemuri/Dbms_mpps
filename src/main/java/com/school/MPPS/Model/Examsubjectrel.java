package com.school.MPPS.Model;

public class Examsubjectrel {
private int examid;
private int subid;


public Examsubjectrel(int examid) {
	super();
	this.examid = examid;
}
public Examsubjectrel(int examid, int subid) {
	super();
	this.examid = examid;
	this.subid = subid;
}
public Examsubjectrel() {
	super();
}
public int getExamid() {
	return examid;
}
public void setExamid(int examid) {
	this.examid = examid;
}
public int getSubid() {
	return subid;
}
public void setSubid(int subid) {
	this.subid = subid;
}

}
