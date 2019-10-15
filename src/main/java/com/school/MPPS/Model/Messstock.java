package com.school.MPPS.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Messstock {
	@Id
	private int msid;
	private int noeggs;
	private String month;
	private int ricekgs;
	
	public Messstock(int msid) {
		super();
		this.msid = msid;
	}
	public Messstock() {
		super();
	}
	public int getMsid() {
		return msid;
	}
	public void setMsid(int msid) {
		this.msid = msid;
	}
	public int getNoeggs() {
		return noeggs;
	}
	public void setNoeggs(int noeggs) {
		this.noeggs = noeggs;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getRicekgs() {
		return ricekgs;
	}
	public void setRicekgs(int ricekgs) {
		this.ricekgs = ricekgs;
	}
	
}
