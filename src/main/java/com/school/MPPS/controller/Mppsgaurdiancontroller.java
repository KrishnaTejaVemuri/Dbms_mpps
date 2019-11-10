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

import com.school.MPPS.Model.Gaurdian;
import com.school.MPPS.service.Gaurdianservice;


@RestController
@RequestMapping("/Gaurdian")
public class Mppsgaurdiancontroller {
	@Autowired
	 Gaurdianservice msd;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("Gaurdian/listing");
	  
	 List<Gaurdian> lst = msd.ListallGaurdians();
	  model.addObject("gobj", lst);
	  
	  return model;
	  
}
	 @RequestMapping(value="/add", method=RequestMethod.GET)
	 public ModelAndView add(){
	  ModelAndView model = new ModelAndView("Gaurdian/adding");
	  
	 Gaurdian Ssa = new Gaurdian();
	  model.addObject("gobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("gobj") Gaurdian Ssa){
	  
	   msd.addGaurdian(Ssa);
	  
	  return new ModelAndView("redirect:/Gaurdian/list");
	 }
	 @RequestMapping(value="/update/{classid}", method=RequestMethod.GET)
	 public ModelAndView update(@PathVariable("classid") int id){
	  ModelAndView model = new ModelAndView("Gaurdian/updating");
	  
	 Gaurdian Ssa = new Gaurdian(id);
	  model.addObject("gobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/updatee", method=RequestMethod.POST)
	 public ModelAndView updatee(@ModelAttribute("gobj") Gaurdian Ssa){
	  
	   msd.updateGaurdian(Ssa);
	  
	  return new ModelAndView("redirect:/Gaurdian/list");
	 }

	 @RequestMapping(value="/delete/{classid}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("classid") int id){
	  msd.deleteGaurdian(id);
	  
	  return new ModelAndView("redirect:/Gaurdian/list");
	 }
	  @RequestMapping(value="/find/{classid}", method=RequestMethod.GET)
		 public ModelAndView find(@PathVariable("classid") int id){
		  ModelAndView model = new ModelAndView("Gaurdian/finding");
		  
			 Gaurdian lst=msd.findGaurdianById(id);
			  model.addObject("gobj", lst);
			  return model;
}
	 @ExceptionHandler
	 public ModelAndView handleexception(Exception e) {
		 ModelAndView model = new ModelAndView("error");
		 model.addObject("errorOccured",e.getMessage());
		 return model;
	 }
}
