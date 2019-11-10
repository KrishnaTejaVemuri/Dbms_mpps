package com.school.MPPS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.school.MPPS.Model.Classmdmrel;
import com.school.MPPS.service.Cmdmservice;

@RestController
@RequestMapping("/cmr")
public class Cmrcontroller {
	@Autowired
	 Cmdmservice msd;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("cmr/listing");
	  
	 List<Classmdmrel> lst = msd.ListallCmdmrels();
	  model.addObject("cmrobj", lst);
	  
	  return model;
	  
}
	 @RequestMapping(value="/add", method=RequestMethod.GET)
	 public ModelAndView add(){
	  ModelAndView model = new ModelAndView("cmr/adding");
	  
	 Classmdmrel Ssa = new Classmdmrel();
	  model.addObject("cmrobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("cmrobj") Classmdmrel Ssa){
	  
	   msd.addClassmdmrel(Ssa);
	  
	  return new ModelAndView("redirect:/cmr/list");
	 }
	
	 
	
	 @ExceptionHandler
	 public ModelAndView handleexception(Exception e) {
		 ModelAndView model = new ModelAndView("error");
		 model.addObject("errorOccured",e.getMessage());
		 return model;
	 }
}
