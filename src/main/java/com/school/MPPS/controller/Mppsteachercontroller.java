package com.school.MPPS.controller;

import java.util.List;

import com.school.MPPS.Model.Mppsstudent;
import com.school.MPPS.Model.Mppsteacher;
import com.school.MPPS.service.Mppsteachersservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
@RequestMapping("/Mppsteacher")
public class Mppsteachercontroller {
	@Autowired
	 Mppsteachersservice msd;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("Mppsteacher/listing");
	  
	 List<Mppsteacher> lst = msd.Listallteachers();
	  model.addObject("Teacherobj", lst);
	  
	  return model;
	  
}
	 @RequestMapping(value="/add", method=RequestMethod.GET)
	 public ModelAndView add(){
	  ModelAndView model = new ModelAndView("Mppsteacher/adding");
	  
	 Mppsteacher Ssa = new Mppsteacher();
	  model.addObject("Teacherobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("Teacherobj") Mppsteacher Ssa){
	  
	   msd.addMppsteacher(Ssa);
	  
	  return new ModelAndView("redirect:/Mppsteacher/list");
	 }
	 @RequestMapping(value="/update/{sgid}", method=RequestMethod.GET)
	 public ModelAndView update(@PathVariable("sgid") int id){
	  ModelAndView model = new ModelAndView("Mppsteacher/updating");
	  
	 Mppsteacher Ssa = new Mppsteacher(id);
	  model.addObject("Teacherobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/updatee", method=RequestMethod.POST)
	 public ModelAndView updatee(@ModelAttribute("Teacherobj") Mppsteacher Ssa){
	  
	   msd.updateMppsteacher(Ssa);
	  
	  return new ModelAndView("redirect:/Mppsteacher/list");
	 }

	 @RequestMapping(value="/delete/{sgid}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("sgid") int id){
	  msd.deleteMppsteacher(id);
	  
	  return new ModelAndView("redirect:/Mppsteacher/list");
	 
}
	@RequestMapping(value="/search")
	public ModelAndView search(){
	ModelAndView model = new ModelAndView("Mppsteacher/search");
	 Mppsteacher Auth = new Mppsteacher();
	  model.addObject("Userobj", Auth);
	
	return model;
	
	}
	 @RequestMapping(value="/search2/", method=RequestMethod.POST)
	 public ModelAndView search2(@ModelAttribute("Userobj") Mppsteacher Userobj){
	  
	  return new ModelAndView("redirect:/Mppsteacher/find/"+Userobj.getMppstid());
	 }
	 @RequestMapping(value="/find/{sgid}", method=RequestMethod.GET)
	 public ModelAndView fing(@PathVariable("sgid") int id){
	  ModelAndView model = new ModelAndView("Mppsteacher/finding");
	  
	 Mppsteacher Ssa = msd.findMppsteacherById(id);
	  model.addObject("Teacherobj", Ssa);
	  
	  return model;	 
}
	 @ExceptionHandler
	 public ModelAndView handleexception(Exception e) {
		 ModelAndView model = new ModelAndView("error");
		 model.addObject("errorOccured",e.getMessage());
		 return model;
	 }
}