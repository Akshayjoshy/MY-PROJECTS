package com.akshay.GroceryMarket.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.akshay.GroceryMarket.DAO.AddressDAO;
import com.akshay.GroceryMarket.DAO.VendorCategoryDAO;
import com.akshay.GroceryMarket.DAO.VendorDAO;
import com.akshay.GroceryMarket.Model.Vendor;
import com.akshay.GroceryMarket.Model.VendorCategory;




@Controller
@RequestMapping("/Vendor")
public class VendorController {

	@Autowired
	VendorDAO vendorDAO;
	
	@Autowired
	AddressDAO addressDAO;
	
	@Autowired
	VendorCategoryDAO venCatDAO;
	
	@PostMapping(value ="/")
	public String saveVendor(HttpServletRequest req) {
		
		String houseName = req.getParameter("houseName");
		String street = req.getParameter("street");
		String postOffice = req.getParameter("postOffice");
		String district = req.getParameter("district");
		String state = req.getParameter("state");
		Long pinCode = Long.parseLong(req.getParameter("pinCode"));
		
		Address address = new Address();
		/*
		 * address.setHouseName(houseName);
		 * address.setStreet(street);
		address.setPostOffice(postOffice);
		address.setDistrict(district);
		address.setState(state);
		address.setPinCode(pinCode);
		Address savedAddress = addressDAO.save(address);
		 */
		
		
		
		
		Long vendorCategoryId = Long.parseLong(req.getParameter("vendorCategoryId"));
		
		VendorCategory venCat = venCatDAO.getReferenceById(vendorCategoryId);
		
		String vendorName = req.getParameter("vendorName");
		String vendorPassword = req.getParameter("vendorPassword");
		String vendorUserType = req.getParameter("vendorUserType");
		
		Vendor vendor = new Vendor();
		//vendor.setAddress(savedAddress);
		vendor.setVendorCategory(venCat);
		vendor.setVendorName(vendorName);
		vendor.setVendorPassword(vendorPassword);
		vendor.setVendorUserType(vendorUserType);
		
		vendorDAO.save(vendor);
		return "AdminHome";
	}
	
	@GetMapping(value = "/")
	public String getAllVendors(Model model) {
		
		List<Vendor> vendorsList = vendorDAO.findAll();
		model.addAttribute("vendorsList", vendorsList);
		return "/Vendor/ViewAllVendor";
	}
	
	@GetMapping(value="/AddVendor")
	public String addVendor() {
		return "/Vendor/AddVendor";
	}
	@GetMapping(value = "/UserTypes")
	public ResponseEntity<Map<String,String>> getVendorUserTypes() {
		Map<String,String> userTypes = new HashMap<String,String>();
		userTypes.put(Vendor.USERTYPE_INDIVIDUAL, Vendor.USERTYPE_INDIVIDUAL);
		userTypes.put(Vendor.USERTYPE_ORGANISATION, Vendor.USERTYPE_ORGANISATION);
		return ResponseEntity.ok(userTypes);
	}
}
