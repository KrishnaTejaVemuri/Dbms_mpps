package com.school.MPPS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.Model.Messstock;
import com.school.MPPS.dao.Messstockdao;

@Service
@Component
public class Messstockserviceimpl implements Messstockservice{
@Autowired
Messstockdao mstd;
@Autowired
public Messstockdao getMstd() {
	return mstd;
}
@Autowired
public void setMstd(Messstockdao mstd) {
	this.mstd = mstd;
}

@Override
public List<Messstock> ListallMessstock() {
	// TODO Auto-generated method stub
	return mstd.ListallMessstock();
}

@Override
public void addMessstock(Messstock Messstock) {
	// TODO Auto-generated method stub
	mstd.addMessstock(Messstock);
}

@Override
public void updateMessstock(Messstock Messstock) {
	// TODO Auto-generated method stub
	mstd.updateMessstock(Messstock);
}

@Override
public void deleteMessstock(int id) {
	// TODO Auto-generated method stub
	mstd.deleteMessstock(id);
}

@Override
public Messstock findMessstockById(int id) {
	// TODO Auto-generated method stub
	return mstd.findMessstockById(id);
}

}
