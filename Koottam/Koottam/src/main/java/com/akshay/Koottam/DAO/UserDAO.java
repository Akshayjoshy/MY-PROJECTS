package com.akshay.Koottam.DAO;


import org.springframework.data.jpa.repository.JpaRepository;

import com.akshay.Koottam.Model.UserEntity;





public interface UserDAO extends JpaRepository <UserEntity,Long>{

	UserEntity getUserByUsernameAndPassword(String username, String password);

	



}
