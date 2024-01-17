package com.agroproject.service;
import java.util.List;
import com.agroproject.model.AgriServices;
import com.agroproject.model.Product;
import com.agroproject.model.ServiceProvider;
import com.agroproject.model.User;
import com.agroproject.payload.AgriServicesPayload;
import com.agroproject.payload.SPServicesPayload;
import com.agroproject.payload.UserProjection;

public interface ProjectService {

	public User addUser(User user);
	
	public User FindByid(int Uid) ;
	
	public List<User> GetAllUserWithServices();
	
	public List<UserProjection> GetOnlyUsers();
	
	public Product addtheProduct(Product product);
	
	public List<Product> getALLProducts();
	
	public Product findProductById(int productId);
	
	public List<AgriServices> getAllAgroServices();
	
	public List<AgriServicesPayload> getOnlyServices();
	
	public ServiceProvider getServiceProviderByid(int spId);
	
	public List<SPServicesPayload> getSPwithServices();
	
	public boolean deleteUserById(int id);
	
	
}
