package com.akshay.GroceryMarket.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshay.GroceryMarket.Model.StockItem;



public interface StockItemDAO extends JpaRepository<StockItem,Long>{

}
