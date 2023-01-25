package com.akshay.kochiProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;




import com.akshay.kochiProject.Model.User;

public interface UserDAO extends JpaRepository<User,Long>{

	User findByUserEmail(String email);
}