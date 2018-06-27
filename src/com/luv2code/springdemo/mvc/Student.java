package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String countryI;
	
	private LinkedHashMap<String, String> countryOptions;
	public Student() {
		
		// populate country options : used ISO country code
		countryOptions = new LinkedHashMap<>(); 
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("PL", "Poland");
		countryOptions.put("US", "USA");
		countryOptions.put("IT", "Italy");
		countryOptions.put("HU", "Hungary");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountryI() {
		return countryI;
	}

	public void setCountryI(String countryI) {
		this.countryI = countryI;
	}
	
	
	
}
