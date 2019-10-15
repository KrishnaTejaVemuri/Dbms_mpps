package com.school.MPPS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.Model.Gaurdian;
import com.school.MPPS.dao.Mppsgaurdiandao;

@Service
@Component
public class Gaurdianserviceimpl implements Gaurdianservice{
@Autowired
Mppsgaurdiandao mgd;
@Autowired
public Mppsgaurdiandao getMgd() {
	return mgd;
}
@Autowired
public void setMgd(Mppsgaurdiandao mgd) {
	this.mgd = mgd;
}
@Override
public List<Gaurdian> ListallGaurdians() {
	// TODO Auto-generated method stub
	return mgd.ListallGaurdians();
}
@Override
public void addGaurdian(Gaurdian Gaurdian) {
	// TODO Auto-generated method stub
	mgd.addGaurdian(Gaurdian);
}
@Override
public void updateGaurdian(Gaurdian Gaurdian) {
	// TODO Auto-generated method stub
	mgd.updateGaurdian(Gaurdian);
}
@Override
public void deleteGaurdian(int id) {
	// TODO Auto-generated method stub
	mgd.deleteGaurdian(id);
}
@Override
public Gaurdian findGaurdianById(int id) {
	// TODO Auto-generated method stub
	return mgd.findGaurdianById(id);
}

}
