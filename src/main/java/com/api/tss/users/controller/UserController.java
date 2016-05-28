package com.api.tss.users.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping(value = "/users")
	public String userResgistration(){
		
		
		
		return "Welcome user";
	}
}
