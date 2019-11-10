package com.school.MPPS.controller;

import java.util.List;

import com.school.MPPS.Model.Mppsstudent;
import com.school.MPPS.service.Mppsstudentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;




@RestController
@RequestMapping("/Mppsstudent")
public class Mppsstudentcontroller {
	@Autowired
	 Mppsstudentservice msd;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("Mppsstudent/listing");
	  
	 List<Mppsstudent> lst = msd.Listallstudents();
	  model.addObject("Stobj", lst);
	  
	  return model;
	  
}
	 @RequestMapping(value="/add", method=RequestMethod.GET)
	 public ModelAndView add(){
	  ModelAndView model = new ModelAndView("Mppsstudent/adding");
	  
	 Mppsstudent auth = new Mppsstudent();
	  model.addObject("Stobj", auth);
	  
	  return model;	 
}
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("Stobj") Mppsstudent auth){
	  
	   msd.addMppsStudent(auth);
	  
	  return new ModelAndView("redirect:/Mppsstudent/list");
	 }
	 @RequestMapping(value="/update/{mppssid}", method=RequestMethod.GET)
	 public ModelAndView update(@PathVariable("mppssid") int id){
	  ModelAndView model = new ModelAndView("Mppsstudent/updating");
	  
	 Mppsstudent Auth = new Mppsstudent(id);
	  model.addObject("Stobj", Auth);
	  
	  return model;	 
}

	@RequestMapping(value="/search")
	public ModelAndView search(){
	ModelAndView model = new ModelAndView("Mppsstudent/search");
	 Mppsstudent Auth = new Mppsstudent();
	  model.addObject("Userobj", Auth);
	
	return model;
	
	}
	 @RequestMapping(value="/search2/", method=RequestMethod.POST)
	 public ModelAndView search2(@ModelAttribute("Userobj") Mppsstudent Userobj){
	  
	  return new ModelAndView("redirect:/Mppsstudent/find/"+Userobj.getMppssid());
	 }
	 @RequestMapping(value="/updatee", method=RequestMethod.POST)
	 public ModelAndView updatee(@ModelAttribute("Stobj") Mppsstudent auth){
	  
	   msd.updateMppsStudent(auth);
	  
	  return new ModelAndView("redirect:/Mppsstudent/list");
	 }
	 
	 @RequestMapping(value="/find/{mppssid}", method=RequestMethod.GET)
	 public ModelAndView find(@PathVariable("mppssid") int id){
	  ModelAndView model = new ModelAndView("Mppsstudent/finding");
	  
	 Mppsstudent Auth = msd.findMppsStudentById(id);
	  model.addObject("Stobj", Auth);
	  
	  return model;
	 }
	 @RequestMapping(value="/delete/{mppssid}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("mppssid") int id){
	  msd.deleteMppsStudent(id);
	  
	  return new ModelAndView("redirect:/Mppsstudent/list");
	 
}
	 @ExceptionHandler
	 public ModelAndView handleexception(Exception e) {
		 ModelAndView model = new ModelAndView("error");
		 model.addObject("errorOccured",e.getMessage());
		 return model;
	 }
}