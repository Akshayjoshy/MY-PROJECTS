package com.akshay.Koottam.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.akshay.Koottam.DAO.UserDAO;
import com.akshay.Koottam.Model.UserEntity;



@Controller
public class UserController {
	@Autowired
	private UserDAO userDAO;
	@GetMapping("/user")
	public String getAllUser(Model m) {
		//List<UserEntity>ue=userDAO.findAll();
		
		return "AddUser";
	}
	@GetMapping(value="/getAllUserTypesAsJson", 
			produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String,String> getAllUserTypes() {
		
		Map<String,String> jsonResponse = new HashMap<String,String>();
		
		jsonResponse.put(UserEntity.USERTYPE_ADMIN,UserEntity.USERTYPE_ADMIN);
		jsonResponse.put(UserEntity.USERTYPE_USER,UserEntity.USERTYPE_USER);
		
		return jsonResponse;
	}
	
	@GetMapping("/getAllUsers")
	public String getAllUsers(Model model) {
		
		List<UserEntity> usersList = userDAO.findAll();
		
		model.addAttribute("usersList",usersList);
		
		return "ViewAllUsers";
	}
	@GetMapping("/id")
	public UserEntity getUserById(@PathVariable long id) {
		
	
		UserEntity user = userDAO.getReferenceById(id);
		return user;
	}
	
	@PostMapping("/saveUser")
	public String updateUser(UserEntity user) {
		
		UserEntity user1 = userDAO.save(user);
		if(user1.getId()!=null) {
			//if succssfully saved
			return "AdminHome";
		}
		else {
			
			return "Error";
		}
	}
	
	

	
		@GetMapping("/deleteUser/id")
		public String deleteUser(@PathVariable long id) {
			UserEntity user = userDAO.getReferenceById(id);
			userDAO.delete(user);
			return "AdminHome";
		}
		
		/*
		 * All UPDATE methods
		 * *****************************
		 */
		@GetMapping("/editUser/id")
		public String editUser(@PathVariable long id,Model model) {
			UserEntity user = userDAO.getReferenceById(id);
			model.addAttribute("user",user);
			
			String[] userTypes = new String [2];
			userTypes[0]=UserEntity.USERTYPE_ADMIN;
			userTypes[1]=UserEntity.USERTYPE_USER;
			//userTypes[2]="hello";
			model.addAttribute("userTypes",userTypes);
			return "EditUser";
		}
		
		@PostMapping("/updateUser")
		public String updateUser1(UserEntity user) {
			
			userDAO.save(user);
			return "AdminHome";
		}
		
	
	}

