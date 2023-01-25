package com.akshay.GroceryMarket.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshay.GroceryMarket.Model.Address;


public interface AddressDAO extends JpaRepository<Address, Long>{

}
