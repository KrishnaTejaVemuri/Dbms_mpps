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

import com.school.MPPS.Model.Middaymeals;
import com.school.MPPS.service.Middaymealsservice;





@RestController
@RequestMapping("/Middaymeals")
public class Middaymealscontroller {
	@Autowired
	 Middaymealsservice msd;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("Middaymeals/listing");
	  
	 List<Middaymeals> lst = msd.ListallMiddaymealss();
	  model.addObject("Mdmobj", lst);
	  
	  return model;
	  
}
	 @RequestMapping(value="/add", method=RequestMethod.GET)
	 public ModelAndView add(){
	  ModelAndView model = new ModelAndView("Middaymeals/adding");
	  
	 Middaymeals Ssa = new Middaymeals();
	  model.addObject("Mdmobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("Mdmobj") Middaymeals Ssa){
	  
	   msd.addMiddaymeals(Ssa);
	  
	  return new ModelAndView("redirect:/Middaymeals/list");
	 }
	 @RequestMapping(value="/update/{mdmid}", method=RequestMethod.GET)
	 public ModelAndView update(@PathVariable("mdmid") int id){
	  ModelAndView model = new ModelAndView("Middaymeals/updating");
	  
	 Middaymeals Ssa = new Middaymeals(id);
	  model.addObject("Mdmobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/updatee", method=RequestMethod.POST)
	 public ModelAndView updatee(@ModelAttribute("Mdmobj") Middaymeals Ssa){
	  
	   msd.updateMiddaymeals(Ssa);
	  
	  return new ModelAndView("redirect:/Middaymeals/list");
	 }

	 @RequestMapping(value="/delete/{mdmid}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("mdmid") int id){
	  msd.deleteMiddaymeals(id);
	  
	  return new ModelAndView("redirect:/Middaymeals/list");
	 
}
	 @ExceptionHandler
	 public ModelAndView handleexception(Exception e) {
		 ModelAndView model = new ModelAndView("error");
		 model.addObject("errorOccured",e.getMessage());
		 return model;
	 }
}