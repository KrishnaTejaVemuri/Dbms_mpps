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

import com.school.MPPS.Model.Mppsclass;
import com.school.MPPS.Model.Prevschool;
import com.school.MPPS.service.Prevschoolservice;





@RestController
@RequestMapping("/Prevschool")
public class Prevschoolcontroller {
	@Autowired
	 Prevschoolservice msd;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("Prevschool/listing");
	  
	 List<Prevschool> lst = msd.ListallPrevschools();
	  model.addObject("Schoolobj", lst);
	  
	  return model;
	  
}
	 @RequestMapping(value="/add", method=RequestMethod.GET)
	 public ModelAndView add(){
	  ModelAndView model = new ModelAndView("Prevschool/adding");
	  
	 Prevschool Ssa = new Prevschool();
	  model.addObject("Schoolobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("Schoolobj") Prevschool Ssa){
	  
	   msd.addPrevschool(Ssa);
	  
	  return new ModelAndView("redirect:/Prevschool/list");
	 }
	 @RequestMapping(value="/update/{schoolid}", method=RequestMethod.GET)
	 public ModelAndView update(@PathVariable("schoolid") int id){
	  ModelAndView model = new ModelAndView("Prevschool/updating");
	  
	 Prevschool Ssa = new Prevschool(id);
	  model.addObject("Schoolobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/updatee", method=RequestMethod.POST)
	 public ModelAndView updatee(@ModelAttribute("Schoolobj") Prevschool Ssa){
	  
	   msd.updatePrevschool(Ssa);
	  
	  return new ModelAndView("redirect:/Prevschool/list");
	 }

	 @RequestMapping(value="/delete/{schoolid}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("schoolid") int id){
	  msd.deletePrevschool(id);
	  
	  return new ModelAndView("redirect:/Prevschool/list");
	 
}		
	 @RequestMapping(value="/find/{schoolid}", method=RequestMethod.GET)
		public ModelAndView find(@PathVariable("schoolid") int id){
	  ModelAndView model = new ModelAndView("Prevschool/finding");
	  
		Prevschool lst=msd.findPrevschoolById(id);
		  model.addObject("Schoolobj", lst);
		  return model;
}
	 @ExceptionHandler
	 public ModelAndView handleexception(Exception e) {
		 ModelAndView model = new ModelAndView("error");
		 model.addObject("errorOccured",e.getMessage());
		 return model;
	 }
}