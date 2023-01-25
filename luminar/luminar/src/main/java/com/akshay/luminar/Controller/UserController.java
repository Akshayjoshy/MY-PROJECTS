package com.akshay.luminar.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.akshay.luminar.Model.UserEntity;
import com.akshay.luminar.Repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	UserRepository ur;
	@GetMapping("/users")
	public String getAllUser(Model m) {
		List<UserEntity>ue=ur.findAll();
		
		return "index";
	}
	@PostMapping("/saveUser")
	public String updateUser(UserEntity user) {
		
		UserEntity user1 = ur.save(user);
		if(user1.getId()!=null) {
			//if succssfully saved
			return "index";
			//return "AdminHome";
		}
		else {
			//if error,display error page
			//m.addAttribute("error","Error creating user.Please try again.");
			//m.addAttribute("prevPage","/admin/");
			return "Error";
		}
		
	}
}
