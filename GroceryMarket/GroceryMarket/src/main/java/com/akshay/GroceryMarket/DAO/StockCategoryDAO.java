package com.akshay.GroceryMarket.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshay.GroceryMarket.Model.StockCategory;



public interface StockCategoryDAO extends JpaRepository<StockCategory,Long>{

}
