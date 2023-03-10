package com.akshay.GroceryMarket.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.akshay.GroceryMarket.DAO.VendorCategoryDAO;
import com.akshay.GroceryMarket.Model.VendorCategory;



@Controller
@RequestMapping("/vendorCategory")
public class VendorCategoryController {

	@Autowired
	private VendorCategoryDAO venCategoryDAO;
	
	@GetMapping(value = "/")
	public ResponseEntity<List<VendorCategory>> getVendorCategoryAsJson() {
		List<VendorCategory> vendorCategories = venCategoryDAO.findAll();
		if(vendorCategories!=null) {
			return ResponseEntity.ok(vendorCategories);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String AddVendorCategory() {
		return "/VendorCategory/AddVendorCategory";
	}
	/*
	 * Vendor Category 
	 * All CREATE methods
	 * *****************************
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveVendorCategory(VendorCategory venCategory) {
		venCategoryDAO.save(venCategory);
		return "redirect:/vendorCategory/getAllVendorCategory";
	}
	
	/*
	 * Vendor Category
	 * All UPDATE methods
	 */
	@RequestMapping(value = "/editVenCat/{id}", method = RequestMethod.GET)
	public String editVendorCategory(@PathVariable Long id,Model model) {
		VendorCategory venCat = venCategoryDAO.getReferenceById(id);
		model.addAttribute("venCat", venCat);
		return "/VendorCategory/EditVendorCategory";
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateVendorCategory(VendorCategory venCategory) {
		venCategoryDAO.save(venCategory);
		return "redirect:/vendorCategory/getAllVendorCategory";
	}
	
	/*
	 * Vendor Category
	 * All READ methods
	 */
	@RequestMapping(value = "/getAllVendorCategory", method = RequestMethod.GET)
	public String getAllVendorCategory(Model model) {
		List<VendorCategory> vendorCategories = venCategoryDAO.findAll();
		model.addAttribute("vendorCategories", vendorCategories);
		return "/VendorCategory/ViewAllVendorCategory";
	}
	
	@RequestMapping(value = "/getAllVendorCategoryAsJson", 
			method = RequestMethod.GET, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<VendorCategory> getAllVendorCategoryAsJson() {
		List<VendorCategory> vendorCategories = venCategoryDAO.findAll();
		
		return vendorCategories;
	}
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public String getVendorCategory(@PathVariable long id,Model model) {
		VendorCategory venCategory = venCategoryDAO.getReferenceById(id);
		model.addAttribute("venCategory", venCategory);
		return "/VendorCategory/ViewAllVendorCategory";
	}
	
	/*
	 * Vendor Category
	 * All DELETE methods
	 */
	@RequestMapping(value = "/deleteVenCat/{id}", method = RequestMethod.GET)
	public String deleteVendorCategory(@PathVariable long id) {
		venCategoryDAO.deleteById(id);
		return "redirect:/vendorCategory/getAllVendorCategory";
	}
}
