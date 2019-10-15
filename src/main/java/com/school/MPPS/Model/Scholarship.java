package com.school.MPPS.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Scholarship {
	@Id
	private int aplid;
	private float appliedamount;
	private float grantamount;
	private String status;
	private int mppssid;
	
	public Scholarship(int aplid) {
		super();
		this.aplid = aplid;
	}
	public Scholarship() {
		super();
	}
	public int getAplid() {
		return aplid;
	}
	public void setAplid(int aplid) {
		this.aplid = aplid;
	}
	public float getAppliedamount() {
		return appliedamount;
	}
	public void setAppliedamount(float appliedamount) {
		this.appliedamount = appliedamount;
	}
	public float getGrantamount() {
		return grantamount;
	}
	public void setGrantamount(float grantamount) {
		this.grantamount = grantamount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getMppssid() {
		return mppssid;
	}
	public void setMppssid(int mppssid) {
		this.mppssid = mppssid;
	}
	
}
