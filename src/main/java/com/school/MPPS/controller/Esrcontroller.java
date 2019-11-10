package com.school.MPPS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.school.MPPS.Model.Examsubjectrel;
import com.school.MPPS.service.Examsubjectrelservice;


@RestController
@RequestMapping("/esr")
public class Esrcontroller {
	@Autowired
	 Examsubjectrelservice msd;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("esr/listing");
	  
	 List<Examsubjectrel> lst = msd.ListallExamsubjectrels();
	  model.addObject("esrobj", lst);
	  
	  return model;
	  
}
	 @RequestMapping(value="/add", method=RequestMethod.GET)
	 public ModelAndView add(){
	  ModelAndView model = new ModelAndView("esr/adding");
	  
	 Examsubjectrel Ssa = new Examsubjectrel();
	  model.addObject("esrobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("esrobj") Examsubjectrel Ssa){
	  
	   msd.addExamsubjectrel(Ssa);
	  
	  return new ModelAndView("redirect:/esr/list");
	 }
	
	 
	
	 @ExceptionHandler
	 public ModelAndView handleexception(Exception e) {
		 ModelAndView model = new ModelAndView("error");
		 model.addObject("errorOccured",e.getMessage());
		 return model;
	 }
}
