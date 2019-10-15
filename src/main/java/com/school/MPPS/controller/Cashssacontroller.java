package com.school.MPPS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.school.MPPS.Model.Cashssa;
import com.school.MPPS.service.Cashssaservice;

@RestController
@RequestMapping("/cashssa")
public class Cashssacontroller {
	@Autowired
	 Cashssaservice css;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("/Test_page");
	  
	 List<Cashssa> lst = css.Listallcashssas();
	  //MppsStudent lst=new MppsStudent(); 
	  model.addObject("listMppsStudent", lst);
	  
	  return model;
}
}
