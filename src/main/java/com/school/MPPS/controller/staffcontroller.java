package com.school.MPPS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.school.MPPS.Model.Mppsstaff;
import com.school.MPPS.service.Mppsstaffservice;


@RestController
@RequestMapping("/staff")
public class staffcontroller {
	@Autowired
	 Mppsstaffservice mss;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("/Test_page");
	  
	 List<Mppsstaff> lst = mss.Listallstaffs();
	  //MppsStudent lst=new MppsStudent(); 
	  model.addObject("listMppsStudent", lst);
	  
	  return model;
	 }
}
