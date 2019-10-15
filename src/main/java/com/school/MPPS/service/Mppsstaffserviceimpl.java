package com.school.MPPS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.Model.Mppsstaff;
import com.school.MPPS.dao.Mppsstaffdao;


@Service
@Component
public class Mppsstaffserviceimpl implements Mppsstaffservice{
@Autowired
Mppsstaffdao mstd;
@Autowired
public Mppsstaffdao getMstd() {
	return mstd;
}
@Autowired
public void setMstd(Mppsstaffdao mstd) {
	this.mstd = mstd;
}
@Override
public List<Mppsstaff> Listallstaffs() {
	// TODO Auto-generated method stub
	return mstd.Listallstaffs();
}
@Override
public void addMppsstaff(Mppsstaff Mppsstaff) {
	// TODO Auto-generated method stub
	mstd.addMppsstaff(Mppsstaff);
}
@Override
public void updateMppsstaff(Mppsstaff Mppsstaff) {
	// TODO Auto-generated method stub
	mstd.updateMppsstaff(Mppsstaff);
}
@Override
public void deleteMppsstaff(int id) {
	// TODO Auto-generated method stub
	mstd.deleteMppsstaff(id);
}
@Override
public Mppsstaff findMppsstaffById(int id) {
	// TODO Auto-generated method stub
	return mstd.findMppsstaffById(id);
}


}
