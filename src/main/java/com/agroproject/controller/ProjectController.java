package com.agroproject.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agroproject.model.AgriServices;
import com.agroproject.model.Product;
import com.agroproject.model.ServiceProvider;
import com.agroproject.model.User;
import com.agroproject.payload.AgriServicesPayload;
import com.agroproject.payload.SPServicesPayload;
import com.agroproject.payload.UserProjection;
import com.agroproject.service.ProjectService;
import jakarta.validation.Valid;

@RestController

@CrossOrigin
public class ProjectController {	
	@Autowired
	ProjectService projectService;
	@PostMapping("AddUser")
	public User SaveUser(@Valid @RequestBody User user)
	{
	  projectService.addUser(user);
		return user;
	}		
	@GetMapping("FindUserById/{Uid}")
	public User FindUserById(@PathVariable("Uid") int Uid)
	{
		User user = projectService.FindByid(Uid);
		return user;
	}
	
	@PostMapping("addProduct")
	public Product SaveProduct(@Valid @RequestBody Product product)
	{
		return projectService.addtheProduct(product);
		
	}
	
	@GetMapping("GetProductByid/{pid}")
	public Product GetProductById(@PathVariable int pid) throws ClassNotFoundException
	{
		return projectService.findProductById(pid);
	}
	
	
	@GetMapping("GetAllAgriServices")
	public List<AgriServices> GetServices()
	{
		List<AgriServices> agriS = projectService.getAllAgroServices();
		return agriS;
	}
	
	
	@GetMapping("GetAllActiveUsers")
	public List<User> getAllUsers()
	{
		List<User> user = projectService.GetAllUserWithServices();
		return user;
	}
	
	@GetMapping("GetListOfOnlyUsers")
	public List<UserProjection> GetUserInfo( )
	{
		List<UserProjection> userList=projectService.GetOnlyUsers();
		System.out.println(userList);
		return userList;
	}
	@GetMapping("GetOnlyAgriServices")
	public List<AgriServicesPayload> GetOnlyServices()
	{
		List<AgriServicesPayload> agriS = projectService.getOnlyServices();
		return agriS;
	}
	
	@GetMapping("GetProductList")
	public List<Product> getProductList()
	{
		List<Product> prodList=projectService.getALLProducts();
		return prodList;
	}
	@GetMapping("GetServiceProviderByID/{spId}")
	public ServiceProvider getSPBYid(@PathVariable("spId") int spId)
	{
		ServiceProvider serviceProvider = projectService.getServiceProviderByid(spId);
		return serviceProvider;
	}
	@GetMapping("GetSPwithListOfServices")
	public List<SPServicesPayload> GetSPwithListOfServices()
	{
		List<SPServicesPayload> SPserviceList=projectService.getSPwithServices();
		return SPserviceList;
	}
	
	@GetMapping("DeleteUserById/{id}")
	public boolean DeleteUser(@PathVariable("id") int id)
	{
		boolean res=projectService.deleteUserById(id);
		if(res)
		{
		 return res;
		}
		else 
		{
			return false;
		}
	}
	
}
