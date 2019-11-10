package com.school.MPPS.controller;

import java.util.List;

import com.school.MPPS.Model.Mppsstaff;
import com.school.MPPS.Model.Mppsstudent;
import com.school.MPPS.service.Mppsstaffservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;





@RestController
@RequestMapping("/Mppsstaff")
public class Mppsstaffcontroller {
	@Autowired
	 Mppsstaffservice msd;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("Mppsstaff/listing");
	  
	 List<Mppsstaff> lst = msd.Listallstaffs();
	  model.addObject("Staffobj", lst);
	  
	  return model;
	  
}
	 @RequestMapping(value="/add", method=RequestMethod.GET)
	 public ModelAndView add(){
	  ModelAndView model = new ModelAndView("Mppsstaff/adding");
	  
	 Mppsstaff Ssa = new Mppsstaff();
	  model.addObject("Staffobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("Staffobj") Mppsstaff Ssa){
	  
	   msd.addMppsstaff(Ssa);
	  
	  return new ModelAndView("redirect:/Mppsstaff/list");
	 }
	 @RequestMapping(value="/update/{staffid}", method=RequestMethod.GET)
	 public ModelAndView update(@PathVariable("staffid") int id){
	  ModelAndView model = new ModelAndView("Mppsstaff/updating");
	  
	 Mppsstaff Ssa = new Mppsstaff(id);
	  model.addObject("Staffobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/updatee", method=RequestMethod.POST)
	 public ModelAndView updatee(@ModelAttribute("Staffobj") Mppsstaff Ssa){
	  
	   msd.updateMppsstaff(Ssa);
	  
	  return new ModelAndView("redirect:/Mppsstaff/list");
	 }

	 @RequestMapping(value="/delete/{staffid}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("staffid") int id){
	  msd.deleteMppsstaff(id);
	  
	  return new ModelAndView("redirect:/Mppsstaff/list");
	 
}
		@RequestMapping(value="/search")
	public ModelAndView search(){
	ModelAndView model = new ModelAndView("Mppsstaff/search");
	 Mppsstaff Auth = new Mppsstaff();
	  model.addObject("Userobj", Auth);
	
	return model;
	
	}
	 @RequestMapping(value="/search2/", method=RequestMethod.POST)
	 public ModelAndView search2(@ModelAttribute("Userobj") Mppsstaff Userobj){
	  
	  return new ModelAndView("redirect:/Mppsstaff/find/"+Userobj.getStaffid());
	 }
	 @RequestMapping(value="/find/{staffid}", method=RequestMethod.GET)
	 public ModelAndView find(@PathVariable("staffid") int id){
	  ModelAndView model = new ModelAndView("Mppsstaff/finding");
	  
		 Mppsstaff lst=msd.findMppsstaffById(id);
		  model.addObject("Staffobj", lst);
		  return model;
}
	 @ExceptionHandler
	 public ModelAndView handleexception(Exception e) {
		 ModelAndView model = new ModelAndView("error");
		 model.addObject("errorOccured",e.getMessage());
		 return model;
	 }
}