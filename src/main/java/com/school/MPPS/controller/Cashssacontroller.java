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

import com.school.MPPS.Model.Cashssa;
import com.school.MPPS.service.Cashssaservice;



@RestController
@RequestMapping("/Cashssa")
public class Cashssacontroller {
	@Autowired
	 Cashssaservice msd;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("Cashssa/listing");
	  
	 List<Cashssa> lst = msd.Listallcashssas();
	  model.addObject("Ssaobj", lst);
	  
	  return model;
	  
}
	 @RequestMapping(value="/add", method=RequestMethod.GET)
	 public ModelAndView add(){
	  ModelAndView model = new ModelAndView("Cashssa/ssaadding");
	  
	 Cashssa Ssa = new Cashssa();
	  model.addObject("Ssaobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("Ssaobj") Cashssa Ssa){
	  
	   msd.addcashssa(Ssa);
	  
	  return new ModelAndView("redirect:/Cashssa/list");
	 }
	 @RequestMapping(value="/update/{sgid}", method=RequestMethod.GET)
	 public ModelAndView update(@PathVariable("sgid") int id){
	  ModelAndView model = new ModelAndView("Cashssa/updating");
	  
	 Cashssa Ssa = new Cashssa(id);
	  model.addObject("Ssaobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/updatee", method=RequestMethod.POST)
	 public ModelAndView updatee(@ModelAttribute("Ssaobj") Cashssa Ssa){
	  
	   msd.updatecashssa(Ssa);
	  
	  return new ModelAndView("redirect:/Cashssa/list");
	 }

	 @RequestMapping(value="/delete/{sgid}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("sgid") int id){
	  msd.deletecashssa(id);
	  
	  return new ModelAndView("redirect:/Cashssa/list");
	 
}
	 @ExceptionHandler
	 public ModelAndView handleexception(Exception e) {
		 ModelAndView model = new ModelAndView("error");
		 model.addObject("errorOccured",e.getMessage());
		 return model;
	 }
}