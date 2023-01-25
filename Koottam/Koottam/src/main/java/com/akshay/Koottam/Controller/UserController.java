package com.akshay.Koottam.Controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.akshay.Koottam.DAO.UserDAO;
import com.akshay.Koottam.Model.UserEntity;



@Controller
public class UserController {
	@Autowired
	private UserDAO userDAO;
	
	@GetMapping("/home")
	public String home(Model m) {	
		
		return "AdminHome";
	}
	
	
	@GetMapping("/user")
	public String addUser(Model m) {
		//List<UserEntity>ue=userDAO.findAll();
		
		return "AddUser";
	}
	
	
	@GetMapping("/getAllUsers")
	public String getAllUsers(Model model) {
		
		List<UserEntity> List = userDAO.findAll();
		
		model.addAttribute("usersList",List);
		
		return "ViewAllUsers";
	}
	@GetMapping("/edit_user/{id}")
	public String editUser(@PathVariable(value="id")Long id,Model m) {
		
		Optional<UserEntity> users =userDAO.findById(id);
		UserEntity user=users.get();
		m.addAttribute("users",user);
		
		return "editUser";
	}
	
	@PostMapping("/saveUser")
	public String updateUser(@ModelAttribute UserEntity user) {
		
		UserEntity user1 = userDAO.save(user);
		if(user1.getId()!=null) {
			//if succssfully saved
			return "AddUser";
		}
		else {
			
			return "Error";
		}
		
	}
	@PostMapping("/update_users")
	public String save(@ModelAttribute UserEntity users,HttpSession session) {
		
		userDAO.save(users);
		session.setAttribute("msg", "User Update Successfully...");
		return "redirect:/getAllUsers";
	}
	
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable(value="id") Long id,HttpSession session) {
		
		userDAO.deleteById(id);
		session.setAttribute("msg", "User Delete Successfully...");
		
		return "redirect:/getAllUsers";
		
	}
}
	

	

