package com.school.MPPS.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Teacherleave {

@Id
private int tlid;
private String fromdate;
private String todate;
private String type;
private int tid;

public Teacherleave(int tlid) {
	super();
	this.tlid = tlid;
}
public Teacherleave() {
	super();
}
public int getTlid() {
	return tlid;
}
public void setTlid(int tlid) {
	this.tlid = tlid;
}
public String getFromdate() {
	return fromdate;
}
public void setFromdate(String fromdate) {
	this.fromdate = fromdate;
}
public String getTodate() {
	return todate;
}
public void setTodate(String todate) {
	this.todate = todate;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}


}
