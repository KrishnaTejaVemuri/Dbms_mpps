package com.school.MPPS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.Model.Mppsclass;
import com.school.MPPS.dao.Mppsclassdao;

@Service
@Component
public class Mppsclassserviceimpl implements Mppsclassservice {
@Autowired
Mppsclassdao mcd;
@Autowired
public Mppsclassdao getMcd() {
	return mcd;
}
@Autowired
public void setMcd(Mppsclassdao mcd) {
	this.mcd = mcd;
}
@Override
public List<Mppsclass> ListallMppsclasss() {
	// TODO Auto-generated method stub
	return mcd.ListallMppsclasss();
}
@Override
public void addMppsclass(Mppsclass Mppsclass) {
	// TODO Auto-generated method stub
	mcd.addMppsclass(Mppsclass);
}
@Override
public void updateMppsclass(Mppsclass Mppsclass) {
	// TODO Auto-generated method stub
	mcd.updateMppsclass(Mppsclass);
}
@Override
public void deleteMppsclass(int id) {
	// TODO Auto-generated method stub
	mcd.deleteMppsclass(id);
}
@Override
public Mppsclass findMppsclassById(int id) {
	// TODO Auto-generated method stub
	return mcd.findMppsclassById(id);
}


}
