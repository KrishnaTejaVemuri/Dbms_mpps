package com.school.MPPS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.school.MPPS.Model.Mppssubject;
import com.school.MPPS.service.Mppssubjectservice;

@RestController
@RequestMapping("/class")
public class Mppsclasscontroller {
	@Autowired
	 Mppssubjectservice css;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("/Test_page");
	  
	 List<Mppssubject> lst = css.Listallsubjects();
	  //MppsStudent lst=new MppsStudent(); 
	  model.addObject("listMppsStudent", lst);
	  
	  return model;
}
}
