package com.school.MPPS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.Model.Mppsteacher;
import com.school.MPPS.dao.Mppsteacherdao;

@Service
@Component
public class Mppsteacherserviceimpl implements Mppsteachersservice{

	@Autowired
	Mppsteacherdao mtd;
	@Autowired
	public Mppsteacherdao getMtd() {
		return mtd;
	}
	@Autowired
	public void setMtd(Mppsteacherdao mtd) {
		this.mtd = mtd;
	}
	@Override
	public List<Mppsteacher> Listallteachers() {
		// TODO Auto-generated method stub
		return mtd.Listallteachers();
	}
	@Override
	public void addMppsteacher(Mppsteacher Mppsteacher) {
		// TODO Auto-generated method stub
		mtd.addMppsteacher(Mppsteacher);
	}
	@Override
	public void updateMppsteacher(Mppsteacher Mppsteacher) {
		// TODO Auto-generated method stub
		mtd.updateMppsteacher(Mppsteacher);;
	}
	@Override
	public void deleteMppsteacher(int id) {
		// TODO Auto-generated method stub
		mtd.deleteMppsteacher(id);
	}
	@Override
	public Mppsteacher findMppsteacherById(int id) {
		// TODO Auto-generated method stub
		return mtd.findMppsteacherById(id);
	}
	
	
}
