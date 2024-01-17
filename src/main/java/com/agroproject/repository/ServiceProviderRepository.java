package com.agroproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.agroproject.model.ServiceProvider;
import com.agroproject.payload.SPServicesPayload;

public interface ServiceProviderRepository extends JpaRepository<ServiceProvider, Integer>{

	@Query(value="select * from service_provider",nativeQuery=true)
	 public List<SPServicesPayload> getSPwithAllServices();
}
