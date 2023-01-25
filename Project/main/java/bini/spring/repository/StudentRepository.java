package bini.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import bini.spring.model.Students;

public interface StudentRepository extends  JpaRepository<Students, Long>{
	  
    @Query("select p from Students p where p.id =?1")
    public Students getById(long id);
	// public StudentEntity getByID(long rollno);
    
   
    @Modifying
    @Query("UPDATE Students c SET c.name = :name WHERE c.id = :id")
    public void updateAddress(@Param("name") String name, @Param("id") long id);
    
    
	

}

