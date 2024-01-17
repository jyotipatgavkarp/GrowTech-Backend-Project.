package com.agroproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.agroproject.dto.UserLogindto;
import com.agroproject.model.Registration;
import com.agroproject.payload.userLoginPayload;

@Repository
public interface UserRegistrationRepo extends JpaRepository<Registration, Integer> {

	//@Query(value = "select  from registration", nativeQuery = true)
	        Registration findByMobilenumber(String mobilenumber);

}
