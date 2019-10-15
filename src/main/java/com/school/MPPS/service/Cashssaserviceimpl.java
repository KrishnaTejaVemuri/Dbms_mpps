package com.school.MPPS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.Model.Cashssa;
import com.school.MPPS.dao.Cashssadao;


@Service
@Component
public class Cashssaserviceimpl implements Cashssaservice{
@Autowired
Cashssadao csd;
@Autowired
public Cashssadao getCsd() {
	return csd;
}
@Autowired
public void setCsd(Cashssadao csd) {
	this.csd = csd;
}
@Override
public List<Cashssa> Listallcashssas() {
	// TODO Auto-generated method stub
	return csd.Listallcashssas();
}
@Override
public void addcashssa(Cashssa cashssa) {
	// TODO Auto-generated method stub
	csd.addcashssa(cashssa);
}
@Override
public void updatecashssa(Cashssa cashssa) {
	// TODO Auto-generated method stub
	csd.updatecashssa(cashssa);
}
@Override
public void deletecashssa(int id) {
	// TODO Auto-generated method stub
	csd.deletecashssa(id);
}
@Override
public Cashssa findcashssaById(int id) {
	// TODO Auto-generated method stub
	return csd.findcashssaById(id);
}

}
