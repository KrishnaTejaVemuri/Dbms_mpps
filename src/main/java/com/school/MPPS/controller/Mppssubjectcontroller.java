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

import com.school.MPPS.Model.Mppssubject;
import com.school.MPPS.service.Mppssubjectservice;



@RestController
@RequestMapping("/Mppssubject")
public class Mppssubjectcontroller {
	@Autowired
	 Mppssubjectservice msd;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("Mppssubject/listing");
	  
	 List<Mppssubject> lst = msd.Listallsubjects();
	  model.addObject("Subobj", lst);
	  
	  return model;
	  
}
	 @RequestMapping(value="/add", method=RequestMethod.GET)
	 public ModelAndView add(){
	  ModelAndView model = new ModelAndView("Mppssubject/adding");
	  
	 Mppssubject auth = new Mppssubject();
	  model.addObject("Subobj", auth);
	  
	  return model;	 
}
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("Subobj") Mppssubject auth){
	  
	   msd.addMppssubject(auth);
	  
	  return new ModelAndView("redirect:/Mppssubject/list");
	 }
	 @RequestMapping(value="/update/{subid}", method=RequestMethod.GET)
	 public ModelAndView update(@PathVariable("subid") int id){
	  ModelAndView model = new ModelAndView("Mppssubject/updating");
	  
	 Mppssubject Auth = new Mppssubject(id);
	  model.addObject("Subobj", Auth);
	  
	  return model;	 
}
	 @RequestMapping(value="/updatee", method=RequestMethod.POST)
	 public ModelAndView updatee(@ModelAttribute("Subobj") Mppssubject auth){
	  
	   msd.updateMppssubject(auth);
	  
	  return new ModelAndView("redirect:/Mppssubject/list");
	 }

	 @RequestMapping(value="/delete/{subid}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("subid") int id){
	  msd.deleteMppssubject(id);
	  
	  return new ModelAndView("redirect:/Mppssubject/list");
	 
}
	 @ExceptionHandler
	 public ModelAndView handleexception(Exception e) {
		 ModelAndView model = new ModelAndView("error");
		 model.addObject("errorOccured",e.getMessage());
		 return model;
	 }
}