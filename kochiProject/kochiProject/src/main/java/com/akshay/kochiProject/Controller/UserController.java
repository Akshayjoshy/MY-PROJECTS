package com.akshay.kochiProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.akshay.kochiProject.Model.User;
import com.akshay.kochiProject.Service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("/")
	public String login() {
		return "index";
	}
	@PostMapping("/saveUser")
	public String addUser(@RequestParam String username,@RequestParam String email,@RequestParam String password,@RequestParam String usertype) {
		User userEntity=new User(username.toLowerCase(),email.toLowerCase(),password,usertype);
		userService.saveUser(userEntity);
		return "index";
	}
	@PostMapping("/login")
	public String userLogin(@RequestParam String email,@RequestParam String password) {
		String uType=userService.validateUser(email, password);
		
		if(uType.equals("admin")) {
			return "AdminHome";
		}else if(uType.equals("backOffice")) {
			return "BackOfficeHome";
		}else {
			return "InvalideLogin";
		}
	}
}