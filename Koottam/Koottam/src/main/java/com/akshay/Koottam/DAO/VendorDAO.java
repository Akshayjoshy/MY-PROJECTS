package com.akshay.Koottam.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshay.Koottam.Model.VendorEntity;

public interface VendorDAO extends JpaRepository<VendorEntity,Long> {

}
