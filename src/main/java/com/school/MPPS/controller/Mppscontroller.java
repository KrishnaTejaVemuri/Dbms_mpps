package com.school.MPPS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.school.MPPS.Model.Mppsstudent;
import com.school.MPPS.service.Mppsstudentservice;

@RestController
@RequestMapping("/")
public class Mppscontroller {
	@Autowired
	 Mppsstudentservice msd;
	 
	 @RequestMapping(value="/", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("/indexfile");
	  
	  
	  return model;
	 }
	 @ExceptionHandler
	 public ModelAndView handleexception(Exception e) {
		 ModelAndView model = new ModelAndView("error");
		 model.addObject("errorOccured",e.getMessage());
		 return model;
	 }
}
