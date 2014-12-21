package com.ams.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ams.model.Student;

@Controller
@RequestMapping("/welcome")
public class HelloController {
	@Autowired
	Student student;
	
	@RequestMapping(method=RequestMethod.GET)
	public String printWelcome(Model model) {
		model.addAttribute("message","Welcome to first example of spring MVC");
		model.addAttribute("student",student);
		return "hello";
	}
	
	
	
	@RequestMapping("/showStudent")
	public String submitForm(Model model) {
		model.addAttribute("message","Student regidter succesfully");
		model.addAttribute("student",student);
		return "hello";
	}
	

}
