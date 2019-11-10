package com.school.MPPS.controller;

import java.util.List;

import com.school.MPPS.Model.Healthlog;
import com.school.MPPS.service.Healthlogservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;





@RestController
@RequestMapping("/Healthlog")
public class Healthlogcontroller {
	@Autowired
	 Healthlogservice msd;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("Healthlog/listing");
	  
	 List<Healthlog> lst = msd.ListallHealthlogs();
	  model.addObject("Hobj", lst);
	  
	  return model;
	  
}

@RequestMapping(value="/list1/{sid}", method=RequestMethod.GET)
	 public ModelAndView list1(@PathVariable("sid") int sid){
	  ModelAndView model = new ModelAndView("Healthlog/listing");
	  
	 List<Healthlog> lst = msd.ListstudentHealthlogs(Integer.toString(sid));
	 System.out.println(sid);
	  model.addObject("Hobj", lst);
	  
	  return model;
	  
}
	 @RequestMapping(value="/add", method=RequestMethod.GET)
	 public ModelAndView add(){
	  ModelAndView model = new ModelAndView("Healthlog/adding");
	  
	 Healthlog Ssa = new Healthlog();
	  model.addObject("Hobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("Hobj") Healthlog Ssa){
	  
	   msd.addHealthlog(Ssa);
	  
	  return new ModelAndView("redirect:/Healthlog/list");
	 }
	 @RequestMapping(value="/update/{checkupid}", method=RequestMethod.GET)
	 public ModelAndView update(@PathVariable("checkupid") int id){
	  ModelAndView model = new ModelAndView("Healthlog/updating");
	  
	 Healthlog Ssa = new Healthlog(id);
	  model.addObject("Hobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/updatee", method=RequestMethod.POST)
	 public ModelAndView updatee(@ModelAttribute("Hobj") Healthlog Ssa){
	  
	   msd.updateHealthlog(Ssa);
	  
	  return new ModelAndView("redirect:/Healthlog/list");
	 }

	 @RequestMapping(value="/delete/{checkupid}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("checkupid") int id){
	  msd.deleteHealthlog(id);
	  
	  return new ModelAndView("redirect:/Healthlog/list");
	 
}
	 @ExceptionHandler
	 public ModelAndView handleexception(Exception e) {
		 ModelAndView model = new ModelAndView("error");
		 model.addObject("errorOccured",e.getMessage());
		 return model;
	 }
}