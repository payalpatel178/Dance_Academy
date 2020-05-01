package com.johnabbott.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.johnabbott.project.model.ProgramEntity;
import com.johnabbott.project.service.ProgramService;

@RequestMapping("/programs")
@Controller
public class ProgramController {
	@Autowired
	ProgramService service;

	// http://localhost:8080/DanceAcademy/index
	@RequestMapping("/index")
	public String indexLocator() {
		return "index";
	}

	// http://localhost:8080/DanceAcademy/about
	@RequestMapping("/about")
	public String aboutLocator() {
		return "about";
	}

	@RequestMapping(value = "/getprograms", method = RequestMethod.GET)
	public ModelAndView getProgramsList() {
		ModelAndView modelView = new ModelAndView("program-list");

		List<ProgramEntity> programs = service.getPrograms();
		modelView.addObject("progList", programs);
		modelView.addObject("program", new ProgramEntity());

		return modelView;
	}

	// ..../danceacademy/programs/program/hiphop
	// hiphop would be passed via path variable
	@RequestMapping(value = "/program/{name}", method = RequestMethod.GET)
	public ModelAndView getProgram(@PathVariable("name") String programName) {
		ModelAndView modelView = new ModelAndView("program");
		modelView.addObject("programName", programName);

		return modelView;
	}

	@RequestMapping(value = "addprogram")
	public ModelAndView addProgram() {
		ModelAndView mv = new ModelAndView("add-program");
		mv.addObject("program", new ProgramEntity());
		return mv;
	}

	@RequestMapping(value = "saveProgram", method = RequestMethod.POST)
	public String saveProgram(@ModelAttribute("program") ProgramEntity prg) {
		if (service.addProgram(prg))
			return "redirect:/programs/getprograms";
		else {
			return "ErrorPage";
		}
	}

	@RequestMapping(value = "deleteprogram")
	public String deleteProgram(@RequestParam("programId") int programId) {
		if (service.deleteProgram(programId)) {
			return "redirect:/programs/getprograms";
		} else {
			return "ErrorPage";
		}
	}

	@RequestMapping(value = "editprogram")
	public ModelAndView editProgram(@RequestParam("programId") int programId) {
		ModelAndView mv = new ModelAndView("update-program");
		ProgramEntity fetchedProgram = service.getProgramById(programId);
		mv.addObject("editedprogram", fetchedProgram);
		return mv;
	}

	@RequestMapping(value = "updateProgram")
	public String updateProgram(@ModelAttribute("program") ProgramEntity prg) {
		if (service.updateProgram(prg)) {
			return "redirect:/programs/getprograms";
		} else {
			return "ErrorPage";
		}
	}

}
