package com.akshay.Koottam.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.akshay.Koottam.DAO.AddressDAO;
import com.akshay.Koottam.DAO.VendorCategoryDAO;
import com.akshay.Koottam.DAO.VendorDAO;
import com.akshay.Koottam.Model.Address;
import com.akshay.Koottam.Model.VendorCategory;
import com.akshay.Koottam.Model.VendorEntity;



@Controller
public class VendorController {
	@Autowired
	private VendorDAO vendorDAO;
	
	@Autowired
	AddressDAO addressDAO;
	
	@Autowired
	VendorCategoryDAO venCatDAO;
	
	@GetMapping("/getAllVendors")
	public String homeVender() {
		
		return "ViewAllVendors";
	}
	
	@GetMapping("/vendors")
	public String addVendor(Model m) {
		//List<UserEntity>ue=userDAO.findAll();
		
		return "AddVendor";
	}
	
	
	@GetMapping("/edit_vendor")
	public String editVender() {
		
		return "editVendor";
	}
	
	@PostMapping("/saveVendor")
	public String saveVendor(@ModelAttribute VendorEntity vendor, Address address,VendorCategory vendorCate) {
		
		vendorDAO.save(vendor);
		addressDAO.save(address);
		venCatDAO.save(vendorCate);
		
		
		return "AddVendor";
		
	}
	
}
	
	
	
	
