package com.johnabbott.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.johnabbott.project.model.Admin;
import com.johnabbott.project.service.AdminService;

@RequestMapping("/admin")
@Controller
public class AdminController {
	@Autowired
	AdminService aservice;

	@RequestMapping(value = { "/", "index" })
	public ModelAndView welcome(@ModelAttribute("admin") Admin admin) {
		ModelAndView mv = new ModelAndView("login");
		List<Admin> admins = aservice.getAdmins();
		mv.addObject("AdminList", admins);
		return mv;
	}

	@RequestMapping(value = "/login")
	// change return String to ModelAndView
	public ModelAndView login(@ModelAttribute("admin") Admin admin) {
		ModelAndView success = new ModelAndView("index");
		success.addObject("admin", admin);
		ModelAndView fail = new ModelAndView("login");
		if (aservice.validateLogin(admin))
			return success;
		// return "redirect:/programs/index";
		else {
			return fail;
			// return "redirect:/admin/login";
		}
	}
}
