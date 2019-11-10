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

import com.school.MPPS.Model.Teacherleave;
import com.school.MPPS.service.Teacherleaveservice;





@RestController
@RequestMapping("/Teacherleave")
public class Teacherleavescontroller {
	@Autowired
	 Teacherleaveservice msd;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("Teacherleaves/listing");
	  
	 List<Teacherleave> lst = msd.ListallTeacherleaves();
	  model.addObject("Tlobj", lst);
	  
	  return model;
	  
}
	 @RequestMapping(value="/add", method=RequestMethod.GET)
	 public ModelAndView add(){
	  ModelAndView model = new ModelAndView("Teacherleaves/adding");
	  
	 Teacherleave Ssa = new Teacherleave();
	  model.addObject("Tlobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("Tlobj") Teacherleave Ssa){
	  
	   msd.addTeacherleave(Ssa);
	  
	  return new ModelAndView("redirect:/Teacherleave/list");
	 }
	 @RequestMapping(value="/update/{tlid}", method=RequestMethod.GET)
	 public ModelAndView update(@PathVariable("tlid") int id){
	  ModelAndView model = new ModelAndView("Teacherleaves/updating");
	  
	 Teacherleave Ssa = new Teacherleave(id);
	  model.addObject("Tlobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/updatee", method=RequestMethod.POST)
	 public ModelAndView updatee(@ModelAttribute("Tlobj") Teacherleave Ssa){
	  
	   msd.updateTeacherleave(Ssa);
	  
	  return new ModelAndView("redirect:/Teacherleave/list");
	 }

	 @RequestMapping(value="/delete/{tlid}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("tlid") int id){
	  msd.deleteTeacherleave(id);
	  
	  return new ModelAndView("redirect:/Teacherleave/list");
	 
}
	 @ExceptionHandler
	 public ModelAndView handleexception(Exception e) {
		 ModelAndView model = new ModelAndView("error");
		 model.addObject("errorOccured",e.getMessage());
		 return model;
	 }
}