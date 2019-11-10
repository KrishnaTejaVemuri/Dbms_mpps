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

import com.school.MPPS.Model.Authoritiesvisit;
import com.school.MPPS.service.Authoritiesvisitservice;
import com.school.MPPS.service.Authoritiesvisitserviceimpl;


@RestController
@RequestMapping("/authorityvisit")
public class Authvisitscontroller {
	@Autowired
	 Authoritiesvisitservice msd;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("authvisit/listauth");
	  
	 List<Authoritiesvisit> lst = msd.Listallvisits();
	  model.addObject("listAuthority", lst);
	  
	  return model;
	  
}
	 @RequestMapping(value="/add", method=RequestMethod.GET)
	 public ModelAndView add(){
	  ModelAndView model = new ModelAndView("authvisit/Authadding");
	  
	 Authoritiesvisit auth = new Authoritiesvisit();
	  model.addObject("Authobj", auth);
	  
	  return model;	 
}
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("Authobj") Authoritiesvisit auth){
	  
	   msd.addAuthoritiesvisit(auth);
	  
	  return new ModelAndView("redirect:/authorityvisit/list");
	 }
	 @RequestMapping(value="/update/{auid}", method=RequestMethod.GET)
	 public ModelAndView update(@PathVariable("auid") int id){
	  ModelAndView model = new ModelAndView("authvisit/updateauth");
	  
	 Authoritiesvisit Auth = new Authoritiesvisit(id);
	  model.addObject("Authobj", Auth);
	  
	  return model;	 
}
	 @RequestMapping(value="/updatee", method=RequestMethod.POST)
	 public ModelAndView updatee(@ModelAttribute("Authobj") Authoritiesvisit auth){
	  
	   msd.updateAuthoritiesvisit(auth);
	  
	  return new ModelAndView("redirect:/authorityvisit/list");
	 }

	 @RequestMapping(value="/delete/{auid}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("auid") int id){
	  msd.deleteAuthoritiesvisit(id);
	  
	  return new ModelAndView("redirect:/authorityvisit/list");
	 
}
	 @ExceptionHandler
	 public ModelAndView handleexception(Exception e) {
		 ModelAndView model = new ModelAndView("error");
		 model.addObject("errorOccured",e.getMessage());
		 return model;
	 }
}