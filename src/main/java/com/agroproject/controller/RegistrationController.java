package com.agroproject.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.agroproject.dto.UserLogindto;
import com.agroproject.model.Registration;
import com.agroproject.repository.UserRegistrationRepo;
@RestController
@CrossOrigin
public class RegistrationController {
	@Autowired
	UserRegistrationRepo userRegistrationRepo;

	@RequestMapping("register")
	public boolean register(@RequestBody Registration registration)
	{
	   try {	
		 
		   
		   userRegistrationRepo.save(registration);
		 
		   System.out.println("in register");
		 
		   registration.setActiveuser(0);
	     	return true;
	     }
	   catch(Exception e)
	   {
		   e.printStackTrace();
		   return false;
	   }
	}
	
	
	 @RequestMapping("login")
   public int login(@RequestBody UserLogindto  loginRequest) {
   	 System.out.println("in login");
       String mobile = loginRequest.getMobilenumber();
       String password = loginRequest.getPassword();
       System.out.println(mobile+" "+password);
       Registration user = userRegistrationRepo.findByMobilenumber(loginRequest.getMobilenumber());
       if(user==null || !(password.equals(user.getPassword())))
       {
       	
       	return 0;
       	
       }
       else
       {
       	if(user.getUsertype()==1)
       	{
       		return 1; // admin
       	}
       	return 2;  // user
       	 
       }
       
           
   }

	
//    @RequestMapping("login")
//    public boolean login(@RequestBody UserLogindto  loginRequest) {
//    	System.out.println("in login");
//        String mobile = loginRequest.getMobilenumber();
//        String password = loginRequest.getPassword();
//        System.out.println(mobile+" "+password);
//        Registration user = userRegistrationRepo.findByMobilenumber(loginRequest.getMobilenumber());
//        if(user==null || !(password.equals(user.getPassword())))
//        {
//        	
//        	return false;
//        }
//        else
//        {
//        	return true;
//        }
//        
//            
//    }

//	@RequestMapping("login")
//    public ResponseEntity<String> login(@RequestBody UserLogindto logindto ) {
//        UserLogindto loginuser = userRegistrationRepo.findAllByMobilenumber(logindto.getMobilenumber());
//        if (loginuser != null && loginuser.getPassword().equals(logindto.getPassword())) {
//            // Successful login
//            return ResponseEntity.ok("Login successful");
//        } else {
//            // Login failed
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed");
//        }
//}

}