package com.school.MPPS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.Model.Prevschool;
import com.school.MPPS.dao.Prevschooldao;

@Service
@Component
public class Prevschoolserviceimpl implements Prevschoolservice{
@Autowired
Prevschooldao psd;
@Autowired
public Prevschooldao getPsd() {
	return psd;
}
@Autowired
public void setPsd(Prevschooldao psd) {
	this.psd = psd;
}
@Override
public List<Prevschool> ListallPrevschools() {
	// TODO Auto-generated method stub
	return psd.ListallPrevschools();
}
@Override
public void addPrevschool(Prevschool Prevschool) {
	// TODO Auto-generated method stub
	psd.addPrevschool(Prevschool);
}
@Override
public void updatePrevschool(Prevschool Prevschool) {
	// TODO Auto-generated method stub
	psd.updatePrevschool(Prevschool);
}
@Override
public void deletePrevschool(int id) {
	// TODO Auto-generated method stub
	psd.deletePrevschool(id);
}
@Override
public Prevschool findPrevschoolById(int id) {
	// TODO Auto-generated method stub
	return psd.findPrevschoolById(id);
}

}
