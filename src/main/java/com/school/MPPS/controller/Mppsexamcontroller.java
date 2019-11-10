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

import com.school.MPPS.Model.Mppsexam;
import com.school.MPPS.service.Mppsexamservice;





@RestController
@RequestMapping("/Mppsexam")
public class Mppsexamcontroller {
	@Autowired
	 Mppsexamservice msd;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("Mppsexam/listing");
	  
	 List<Mppsexam> lst = msd.ListallMppsexams();
	  model.addObject("Examobj", lst);
	  
	  return model;
	  
}
	 @RequestMapping(value="/add", method=RequestMethod.GET)
	 public ModelAndView add(){
	  ModelAndView model = new ModelAndView("Mppsexam/adding");
	  
	 Mppsexam Ssa = new Mppsexam();
	  model.addObject("Examobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("Examobj") Mppsexam Ssa){
	  
	   msd.addMppsexam(Ssa);
	  
	  return new ModelAndView("redirect:/Mppsexam/list");
	 }
	 @RequestMapping(value="/update/{examid}", method=RequestMethod.GET)
	 public ModelAndView update(@PathVariable("examid") int id){
	  ModelAndView model = new ModelAndView("Mppsexam/updating");
	  
	 Mppsexam Ssa = new Mppsexam(id);
	  model.addObject("Examobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/updatee", method=RequestMethod.POST)
	 public ModelAndView updatee(@ModelAttribute("Examobj") Mppsexam Ssa){
	  
	   msd.updateMppsexam(Ssa);
	  
	  return new ModelAndView("redirect:/Mppsexam/list");
	 }

	 @RequestMapping(value="/delete/{examid}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("examid") int id){
	  msd.deleteMppsexam(id);
	  
	  return new ModelAndView("redirect:/Mppsexam/list");
	 
}
	 @ExceptionHandler
	 public ModelAndView handleexception(Exception e) {
		 ModelAndView model = new ModelAndView("error");
		 model.addObject("errorOccured",e.getMessage());
		 return model;
	 }
}