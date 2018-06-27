package com.luv2code.springdemo.mvc;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.javafx.collections.MappingChange.Map;

import org.springframework.beans.factory.annotation.Value;
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