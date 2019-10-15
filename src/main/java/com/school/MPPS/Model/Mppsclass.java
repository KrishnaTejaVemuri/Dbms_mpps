package com.school.MPPS.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Mppsclass {
	@Id
	private int classid;
	private int roomno;
	
	public Mppsclass(int classid) {
		super();
		this.classid = classid;
	}
	public Mppsclass() {
		super();
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	
	
	
}
