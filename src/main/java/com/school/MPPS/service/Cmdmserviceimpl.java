package com.school.MPPS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.Model.Classmdmrel;
import com.school.MPPS.dao.Cmdmdao;

@Service
@Component
public class Cmdmserviceimpl implements Cmdmservice{
	@Autowired
	Cmdmdao cd;
	@Autowired
	public Cmdmdao getCd() {
		return cd;
	}
	@Autowired
	public void setCd(Cmdmdao cd) {
		this.cd = cd;
	}
	@Override
	public List<Classmdmrel> ListallCmdmrels() {
		// TODO Auto-generated method stub
		return cd.ListallCmdmrels();
	}
	@Override
	public void addClassmdmrel(Classmdmrel Classmdmrel) {
		// TODO Auto-generated method stub
		cd.addClassmdmrel(Classmdmrel);
	}
	@Override
	public Classmdmrel findClassmdmrelById(int id) {
		// TODO Auto-generated method stub
		return cd.findClassmdmrelById(id);
	}

}
