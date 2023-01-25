package com.akshay.luminar.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshay.luminar.Model.UserEntity;



public interface UserRepository extends JpaRepository <UserEntity,Long>{

}
