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
import com.school.MPPS.service.Mppsclassservice;




@RestController
@RequestMapping("/Mppsclass")
public class Mppsclasscontroller {
	@Autowired
	 Mppsclassservice msd;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("Mppsclass/listing");
	  
	 List<Mppsclass> lst = msd.ListallMppsclasss();
	  model.addObject("Classobj", lst);
	  
	  return model;
	  
}
	 @RequestMapping(value="/add", method=RequestMethod.GET)
	 public ModelAndView add(){
	  ModelAndView model = new ModelAndView("Mppsclass/adding");
	  
	 Mppsclass Ssa = new Mppsclass();
	  model.addObject("Classobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("Classobj") Mppsclass Ssa){
	  
	   msd.addMppsclass(Ssa);
	  
	  return new ModelAndView("redirect:/Mppsclass/list");
	 }
	 @RequestMapping(value="/update/{classid}", method=RequestMethod.GET)
	 public ModelAndView update(@PathVariable("classid") int id){
	  ModelAndView model = new ModelAndView("Mppsclass/updating");
	  
	 Mppsclass Ssa = new Mppsclass(id);
	  model.addObject("Classobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/updatee", method=RequestMethod.POST)
	 public ModelAndView updatee(@ModelAttribute("Classobj") Mppsclass Ssa){
	  
	   msd.updateMppsclass(Ssa);
	  
	  return new ModelAndView("redirect:/Mppsclass/list");
	 }

	 @RequestMapping(value="/delete/{classid}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("classid") int id){
	  msd.deleteMppsclass(id);
	  
	  return new ModelAndView("redirect:/Mppsclass/list");
	 }
	  @RequestMapping(value="/find/{classid}", method=RequestMethod.GET)
		 public ModelAndView find(@PathVariable("classid") int id){
		  ModelAndView model = new ModelAndView("Mppsclass/finding");
		  
			 Mppsclass lst=msd.findMppsclassById(id);
			  model.addObject("Classobj", lst);
			  return model;
}
	 @ExceptionHandler
	 public ModelAndView handleexception(Exception e) {
		 ModelAndView model = new ModelAndView("error");
		 model.addObject("errorOccured",e.getMessage());
		 return model;
	 }
}