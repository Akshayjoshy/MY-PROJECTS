package com.akshay.GroceryMarket.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshay.GroceryMarket.Model.Stock;



public interface StockDAO extends JpaRepository<Stock,Long>{

}
