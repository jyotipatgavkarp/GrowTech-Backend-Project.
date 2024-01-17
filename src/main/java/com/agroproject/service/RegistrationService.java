package com.agroproject.service;

import jakarta.servlet.Registration;

public interface RegistrationService {

	
	 public Registration authenticate(String mobile, String password);
}
