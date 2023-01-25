package com.akshay.Koottam.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.akshay.Koottam.DAO.VendorCategoryDAO;

import com.akshay.Koottam.Model.VendorCategory;

@Controller
public class VendorCategoryController {

	@Autowired
	VendorCategoryDAO venCatDAO;
	
	@GetMapping("/vendorCategory")
	public String getAllVendorCategory(Model m) {
		//List<UserEntity>ue=userDAO.findAll();
		
		return "AddVendorCategory";
	}
	@PostMapping("/saveVendorCategory")
	public String saveVendorCategory(VendorCategory venCategory) {
		VendorCategory veCategory = venCatDAO.save(venCategory);
		if(veCategory.getVendorCategoryId()!=null) {
			//if succssfully saved
			return "AdminHome";
		}
		else {
			return "Error";
		}
		
	}
}
