package com.johnabbott.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import com.johnabbott.project.model.PersonEntity;
import com.johnabbott.project.service.PersonService;

@RequestMapping("/persons")
@Controller
public class PersonController {

	@Autowired
	PersonService pservice;

	@RequestMapping(value = "/addperson")
	public ModelAndView addPerson() {
		ModelAndView mv = new ModelAndView("admission");
		mv.addObject("person", new PersonEntity());
		return mv;
	}

	@RequestMapping(value = "savePerson", method = RequestMethod.POST)
	public String savePerson(@ModelAttribute("person") PersonEntity per) {
		if (pservice.addPerson(per))
			return "redirect:/persons/addperson";
		else {
			return "ErrorPage";
		}
	}

}
