package com.school.MPPS.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Cashssa {
	@Id
	private int sgid;
	private float maintainancegrant;
	private float schoolgrant;
	private String month;
	
	public Cashssa(int sgid) {
		super();
		this.sgid = sgid;
	}
	public Cashssa() {
		super();
	}
	public int getSgid() {
		return sgid;
	}
	public void setSgid(int sgid) {
		this.sgid = sgid;
	}
	public float getMaintainancegrant() {
		return maintainancegrant;
	}
	public void setMaintainancegrant(float maintainancegrant) {
		this.maintainancegrant = maintainancegrant;
	}
	public float getSchoolgrant() {
		return schoolgrant;
	}
	public void setSchoolgrant(float schoolgrant) {
		this.schoolgrant = schoolgrant;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	
}
