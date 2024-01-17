package com.agroproject.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroproject.model.AgriServices;
import com.agroproject.model.Product;
import com.agroproject.model.ServiceProvider;
import com.agroproject.model.User;
import com.agroproject.payload.AgriServicesPayload;
import com.agroproject.payload.SPServicesPayload;
import com.agroproject.payload.UserProjection;
import com.agroproject.repository.AgroRepository;
import com.agroproject.repository.ProductRepository;
import com.agroproject.repository.ServiceProviderRepository;
import com.agroproject.repository.UserRepository;
import com.agroproject.service.ProjectService;
@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	UserRepository projectrepository;

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	AgroRepository agroRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ServiceProviderRepository serviceProviderRepository;
	@Override
	public User addUser(User user) {

	User newuser=projectrepository.save(user);
		return newuser;
	}
	@Override
	public User FindByid(int Uid)  {
	
	  User user = projectrepository.findById(Uid).get();
     //orElseThrow(()-> new ClassNotFoundException("Element not found with id: " + Uid));
	  return user;		
}
	@Override
	public Product addtheProduct(Product product) {
		
		Product product1=productRepository.save(product);
		return product1;
	}
	@Override
	public Product findProductById(int Pid) {
		
		Product product1=productRepository.findById(Pid).get();
		return product1;
	}
	@Override
	public List<AgriServices> getAllAgroServices() {
		List<AgriServices> agriservices= agroRepository.findAll();
		return agriservices;
	}
	@Override
	public List<AgriServicesPayload> getOnlyServices() {
		List<AgriServicesPayload> AgriServicesList = agroRepository.getAllAgriServices();
		return AgriServicesList;
	}
	@Override
	public List<User> GetAllUserWithServices() {
		List<User> user = userRepository.findAll();
		return user;
	}
	@Override
	public List<UserProjection> GetOnlyUsers() {
		List<UserProjection> userList= userRepository.getOnlyUser();
		return userList;
	}
	@Override
	public List<Product> getALLProducts() {
		List<Product> productList=productRepository.findAll(); 
		return productList;
	}
	@Override
	public ServiceProvider getServiceProviderByid(int spId) {
	ServiceProvider serviceprovider=serviceProviderRepository.findById(spId).get();
		return serviceprovider;
	}
	@Override
	public List<SPServicesPayload> getSPwithServices() {
		List<SPServicesPayload> splist=serviceProviderRepository.getSPwithAllServices();
		return splist;
	}
	@Override
	public boolean deleteUserById(int id) {
		
		
		userRepository.deleteById(id);
		return true;
	}
	
}