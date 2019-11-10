package com.school.MPPS.Model;

public class Classmdmrel {
	private int classid;
	private int mdmid;
	
	public Classmdmrel(int mdmid) {
		super();
		this.mdmid = mdmid;
	}
	public Classmdmrel(int classid, int mdmid) {
		super();
		this.classid = classid;
		this.mdmid = mdmid;
	}
	public Classmdmrel() {
		super();
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public int getMdmid() {
		return mdmid;
	}
	public void setMdmid(int mdmid) {
		this.mdmid = mdmid;
	}
	

}
