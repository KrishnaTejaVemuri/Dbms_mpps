package com.school.MPPS.controller;

import java.util.List;

import com.school.MPPS.Model.Messstock;
import com.school.MPPS.Model.Mppsstudent;
import com.school.MPPS.service.Messstockservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;





@RestController
@RequestMapping("/Messstock")
public class Messstockcontroller {
	@Autowired
	 Messstockservice msd;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
	  ModelAndView model = new ModelAndView("Messstock/listing");
	  
	 List<Messstock> lst = msd.ListallMessstock();
	  model.addObject("Mstobj", lst);
	  
	  return model;
	  
}
	 @RequestMapping(value="/add", method=RequestMethod.GET)
	 public ModelAndView add(){
	  ModelAndView model = new ModelAndView("Messstock/adding");
	  
	 Messstock Ssa = new Messstock();
	  model.addObject("Mstobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("Mstobj") Messstock Ssa){
	  
	   msd.addMessstock(Ssa);
	  
	  return new ModelAndView("redirect:/Messstock/list");
	 }
	 @RequestMapping(value="/update/{msid}", method=RequestMethod.GET)
	 public ModelAndView update(@PathVariable("msid") int id){
	  ModelAndView model = new ModelAndView("Messstock/updating");
	  
	 Messstock Ssa = new Messstock(id);
	  model.addObject("Mstobj", Ssa);
	  
	  return model;	 
}
	 @RequestMapping(value="/updatee", method=RequestMethod.POST)
	 public ModelAndView updatee(@ModelAttribute("Mstobj") Messstock Ssa){
	  
	   msd.updateMessstock(Ssa);
	  
	  return new ModelAndView("redirect:/Messstock/list");
	 }

	 @RequestMapping(value="/delete/{msid}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("msid") int id){
	  msd.deleteMessstock(id);
	  
	  return new ModelAndView("redirect:/Messstock/list");
	 
} 	
@RequestMapping(value="/search")
	public ModelAndView search(){
	ModelAndView model = new ModelAndView("Messstock/search");
	 Messstock Auth = new Messstock();
	  model.addObject("Userobj", Auth);
	
	return model;
	
	}
	 @RequestMapping(value="/search2/", method=RequestMethod.POST)
	 public ModelAndView search2(@ModelAttribute("Userobj") Messstock Userobj){
	  
	  return new ModelAndView("redirect:/Messstock/find/"+Userobj.getMsid());
	 }
	 @RequestMapping(value="/find/{msid}", method=RequestMethod.GET)
public ModelAndView find(@PathVariable("msid") int id){
		 ModelAndView model = new ModelAndView("Messstock/finding");
		 Messstock Ssa = msd.findMessstockById(id);
		  model.addObject("Mstobj", Ssa);
		  
	  return model;
	 
}
	 @ExceptionHandler
	 public ModelAndView handleexception(Exception e) {
		 ModelAndView model = new ModelAndView("error");
		 model.addObject("errorOccured",e.getMessage());
		 return model;
	 }
}