package com.school.MPPS.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mppsexam {
@Id
private int examid;
private String examname;
private float marksobtained;
private float maxmarks;
private int mppssid;

public Mppsexam(int examid) {
	super();
	this.examid = examid;
}
public Mppsexam() {
	super();
}
public int getExamid() {
	return examid;
}
public void setExamid(int examid) {
	this.examid = examid;
}
public String getExamname() {
	return examname;
}
public void setExamname(String examname) {
	this.examname = examname;
}
public float getMarksobtained() {
	return marksobtained;
}
public void setMarksobtained(float marksobtained) {
	this.marksobtained = marksobtained;
}
public float getMaxmarks() {
	return maxmarks;
}
public void setMaxmarks(float maxmarks) {
	this.maxmarks = maxmarks;
}
public int getMppssid() {
	return mppssid;
}
public void setMppssid(int mppssid) {
	this.mppssid = mppssid;
}

}
