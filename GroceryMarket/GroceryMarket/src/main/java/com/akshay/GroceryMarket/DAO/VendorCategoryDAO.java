package com.akshay.GroceryMarket.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshay.GroceryMarket.Model.VendorCategory;



public interface VendorCategoryDAO extends JpaRepository<VendorCategory, Long>{

}
