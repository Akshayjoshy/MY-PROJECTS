package com.akshay.kochiProject.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akshay.kochiProject.Model.User;
import com.akshay.kochiProject.Repository.UserDAO;

@Service
@Transactional
public class UserService {
	
	@Autowired
	UserDAO userDAO;
	public void saveUser(User userEntity) {
		
		try {
			userDAO.save(userEntity);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public String validateUser(String email,String password) {
		User user=userDAO.findByUserEmail(email);
		if(user!=null && user.getPassword().equals(password) && user.getUsertype().equals("ADMIN")) {
			return "admin";
		}else if(user!=null && user.getPassword().equals(password)&& user.getUsertype().equals("BACKOFFICE")) {
			return "backOffice";
		}else {
			return "invalid";
		}
	}
}
