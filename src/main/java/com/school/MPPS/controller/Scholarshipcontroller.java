package com.school.MPPS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.school.MPPS.Model.Mppsstudent;
import com.school.MPPS.Model.Scholarship;
import com.school.MPPS.service.Scholarshipservice;





@RestController
@RequestMapping("/Scholarship")
public class Scholarshipcontroller {
	@Autowired
	 Scholarshipservice msd;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("Scholarship/listing");
	  
	 List<Scholarship> lst = msd.ListallScholarships();
	  model.addObject("Schobj", lst);
	  
	  return model;
	  
}
	 @RequestMapping(value="/add", method=RequestMethod.GET)
	 public ModelAndView add(){
	  ModelAndView model = new ModelAndView("Scholarship/adding");
	  
	 Scholarship Ssa = new Scholarship();
	  model.addObject("Schobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("Schobj") Scholarship Ssa){
	  
	   msd.addScholarship(Ssa);
	  
	  return new ModelAndView("redirect:/Scholarship/list");
	 }
	 @RequestMapping(value="/update/{aplid}", method=RequestMethod.GET)
	 public ModelAndView update(@PathVariable("aplid") int id){
	  ModelAndView model = new ModelAndView("Scholarship/updating");
	  
	 Scholarship Ssa = new Scholarship(id);
	  model.addObject("Schobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/updatee", method=RequestMethod.POST)
	 public ModelAndView updatee(@ModelAttribute("Schobj") Scholarship Ssa){
	  
	   msd.updateScholarship(Ssa);
	  
	  return new ModelAndView("redirect:/Scholarship/list");
	 }

	 @RequestMapping(value="/delete/{aplid}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("aplid") int id){
	  msd.deleteScholarship(id);
	  
	  return new ModelAndView("redirect:/Scholarship/list");
	 
}
	
	 @ExceptionHandler
	 public ModelAndView handleexception(Exception e) {
		 ModelAndView model = new ModelAndView("error");
		 model.addObject("errorOccured",e.getMessage());
		 return model;
	 }
}