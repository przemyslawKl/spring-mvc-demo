package com.luv2code.springdemo.mvc;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
@RequestMapping ("/student")
public class StudentController {

	@RequestMapping ("/showForm")
	public String showForm(Model theModel) {
		
		// create  student object
		Student theStudent = new Student();
		// add student object to the model
		theModel.addAttribute("student", theStudent);
		return "student-form";
	}
	@RequestMapping ("/processForm")
	public String processForm (@ModelAttribute ("student") Student theStudent) {
		
		// log the input data
		System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());
		
		return "student-confirmation";
	}
}

/*
<form:option value = "Poland" label = "Poland"/>
<form:option value = "Germany" label = "Germany"/>
<form:option value = "USA" label = "USA"/>
<form:option value = "Croatia" label = "Croatia"/>
<form:option value = "Spain" label = "Spain"/>
<form:option value = "Portugal" label = "Portugal"/>
*/