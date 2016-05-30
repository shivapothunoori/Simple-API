package com.api.tss.users.controller;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.api.tss.users.pojo.UserPojo;
import com.api.tss.users.service.UserService;
import com.api.tss.utils.TssUtils;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public @ResponseBody String userResgistration(@RequestBody UserPojo user) {
		
		Properties p = new Properties();
		String env = p.getProperty("ENV");
		System.out.println("ENV::: " + env);
		String env1 = System.getProperty("ENV");
		System.out.println("ENV1::: " + env1);
		
		String env2 = System.getenv("ENV");
		System.out.println(env2);
//		System.out.println("ENV2: " + TssUtils.getProperty("NAME"));
		
		UserPojo user1 = new UserPojo();
		user1.setEmail(user.getEmail());
		user1.setName(user.getName());
		user1.setMobile(user.getMobile());
		System.out.println("name: " + user1.getName());
		if (user.getEmail() == null) {
			try {
				throw new Exception("Email is required");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (userService.userRegistration(user1)) {
			return "Inserted====";
		}

		return "Something worng pls check......";
	}
}
