package com.school.MPPS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.Model.Authoritiesvisit;
import com.school.MPPS.dao.Authoritiesvisitdao;

@Service
@Component
public class Authoritiesvisitserviceimpl implements Authoritiesvisitservice {
@Autowired
Authoritiesvisitdao avd;
@Autowired
public Authoritiesvisitdao getAvd() {
	return avd;
}
@Autowired
public void setAvd(Authoritiesvisitdao avd) {
	this.avd = avd;
}
@Override
public List<Authoritiesvisit> Listallvisits() {
	// TODO Auto-generated method stub
	return avd.Listallvisits();
}
@Override
public void addAuthoritiesvisit(Authoritiesvisit Authoritiesvisit) {
	// TODO Auto-generated method stub
	avd.addAuthoritiesvisit(Authoritiesvisit);
}
@Override
public void updateAuthoritiesvisit(Authoritiesvisit Authoritiesvisit) {
	// TODO Auto-generated method stub
	avd.updateAuthoritiesvisit(Authoritiesvisit);
}
@Override
public void deleteAuthoritiesvisit(int id) {
	// TODO Auto-generated method stub
	avd.deleteAuthoritiesvisit(id);
}
@Override
public Authoritiesvisit findAuthoritiesvisitById(int id) {
	// TODO Auto-generated method stub
	return avd.findAuthoritiesvisitById(id);
}

}
