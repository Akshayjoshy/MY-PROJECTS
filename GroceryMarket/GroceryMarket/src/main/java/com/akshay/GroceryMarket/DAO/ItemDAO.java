package com.akshay.GroceryMarket.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshay.GroceryMarket.Model.Item;


public interface ItemDAO extends JpaRepository<Item, Long>{

}