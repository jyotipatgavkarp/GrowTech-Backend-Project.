package com.agroproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.agroproject.model.AgriServices;
import com.agroproject.payload.AgriServicesPayload;

public interface AgroRepository extends JpaRepository<AgriServices, Integer> {
	
	@Query(value="select * from agri_services", nativeQuery = true)
	public List<AgriServicesPayload> getAllAgriServices();

}
