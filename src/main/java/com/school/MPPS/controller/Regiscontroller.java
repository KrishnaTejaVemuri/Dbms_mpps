package com.school.MPPS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.school.MPPS.service.Userservice;
import com.school.MPPS.Model.User;
@RestController
@RequestMapping("/user")
public class Regiscontroller {
	@Autowired
	 Userservice msd;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("User/listing");
	  
	 List<User> lst = msd.ListallUsers();
	  model.addObject("Userobj", lst);
	  
	  return model;
	  
}
	 @RequestMapping(value="/add", method=RequestMethod.GET)
	 public ModelAndView add(){
	  ModelAndView model = new ModelAndView("User/adding");
	  
	 User Ssa = new User();
	  model.addObject("Userobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("Userobj") User Ssa){
		 BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	  Ssa.setPassword(encoder.encode(Ssa.getPassword()));
	  
	   msd.addUser(Ssa);
	  
	  return new ModelAndView("redirect:/user/list");
	 }
	 @RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	 public ModelAndView update(@PathVariable("id") int id){
	  ModelAndView model = new ModelAndView("User/updating");
	  
	 User Ssa = new User(id);
	  model.addObject("Userobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/updatee", method=RequestMethod.POST)
	 public ModelAndView updatee(@ModelAttribute("Userobj") User Ssa){
		 BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
		  Ssa.setPassword(encoder.encode(Ssa.getPassword()));
		  
	   msd.updateUser(Ssa);
	  
	  return new ModelAndView("redirect:/user/list");
	 }

	 @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") int id){
	  msd.deleteUser(id);
	  
	  return new ModelAndView("redirect:/user/list");
	 
}
	 @ExceptionHandler
	 public ModelAndView handleexception(Exception e) {
		 ModelAndView model = new ModelAndView("error");
		 model.addObject("errorOccured",e.getMessage());
		 return model;
	 }
}

