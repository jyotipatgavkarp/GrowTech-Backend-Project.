package com.agroproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agroproject.payload.UserProjection;
import com.agroproject.service.ProjectService;

@RestController
public class AdminController {

	@Autowired
	ProjectService projectService;
	
//	@RequestMapping("GetListOfOnlyUsers")
//	public List<UserProjection> GetUserInfo( )
//	{
//		List<UserProjection> userList=projectService.GetOnlyUsers();
//		return userList;
//	}
//	
	
}
