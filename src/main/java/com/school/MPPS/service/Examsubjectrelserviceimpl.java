package com.school.MPPS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.Model.Examsubjectrel;
import com.school.MPPS.dao.Examsubjectreldao;

@Service
@Component
public class Examsubjectrelserviceimpl implements Examsubjectrelservice{
@Autowired
Examsubjectreldao esd;
@Autowired
public Examsubjectreldao getEsd() {
	return esd;
}
@Autowired
public void setEsd(Examsubjectreldao esd) {
	this.esd = esd;
}
@Override
public List<Examsubjectrel> ListallExamsubjectrels() {
	// TODO Auto-generated method stub
	return esd.ListallExamsubjectrels();
}
@Override
public void addExamsubjectrel(Examsubjectrel Examsubjectrel) {
	// TODO Auto-generated method stub
	esd.addExamsubjectrel(Examsubjectrel);
}
@Override
public Examsubjectrel findExamsubjectrelById(int id) {
	// TODO Auto-generated method stub
	return esd.findExamsubjectrelById(id);
}

}
