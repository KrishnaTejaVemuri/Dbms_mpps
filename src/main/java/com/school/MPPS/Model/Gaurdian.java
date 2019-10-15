package com.school.MPPS.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gaurdian {
@Id
private int mppssid;
private int mppsgid;
private String gname;
private String relation;

public Gaurdian(int mppsgid) {
	super();
	this.mppsgid = mppsgid;
}
public Gaurdian(int mppssid, int mppsgid) {
	super();
	this.mppssid = mppssid;
	this.mppsgid = mppsgid;
}
public Gaurdian() {
	super();
}
public int getMppssid() {
	return mppssid;
}
public void setMppssid(int mppssid) {
	this.mppssid = mppssid;
}
public int getMppsgid() {
	return mppsgid;
}
public void setMppsgid(int mppsgid) {
	this.mppsgid = mppsgid;
}
public String getGname() {
	return gname;
}
public void setGname(String gname) {
	this.gname = gname;
}
public String getRelation() {
	return relation;
}
public void setRelation(String relation) {
	this.relation = relation;
}

}
