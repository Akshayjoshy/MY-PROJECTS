package com.akshay.org.springframework.boots.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akshay.org.springframework.boots.Model.Model;



@RestController
public class PersonController {
	
	@RequestMapping("/")
	
	String Home() {
		return "homepage";
	}
	@GetMapping("/Model")
	public List<Model> getAllPersons(){
		List<Model> personList = new ArrayList<Model>();
		personList.add(new Model(1,"Akshay", 20));
		personList.add(new Model(2,"Asiya", 25));
		personList.add(new Model(3,"Pathu", 25));
		return personList;
	}

}
