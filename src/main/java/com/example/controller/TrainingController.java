package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TrainingController {
	
	@Autowired
	Person person;
	
	@RequestMapping(value="/greet",method=RequestMethod.GET)
	public Person helloWorld() {
		return person;
		
	}

}
