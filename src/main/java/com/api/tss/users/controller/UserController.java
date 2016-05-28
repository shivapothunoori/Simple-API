package com.api.tss.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.tss.users.models.Users;
import com.api.tss.users.pojo.UserPojo;
import com.api.tss.users.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	
	@RequestMapping(value = "/users", method=RequestMethod.GET)
	
	public  String userResgistration(@RequestParam("name") String name,			@RequestParam("email") String email,@RequestParam("mobile") String mobile){
//		public  String userResgistration(@RequestBody UserPojo user){
	System.out.println("NAMWE::: " + name);
			UserPojo user1 = new UserPojo();
		user1.setEmail(email);
		user1.setName(name);
		user1.setMobile(mobile);
		System.out.println("name: " + user1.getName());
		if(email == null ){
			try {
				throw new Exception("Email is required");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(userService.userRegistration(user1)){
			return "Inserted====";
		}
		
		
		return "Something worng pls check......";
	}
}
