package com.api.tss.users.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.tss.users.dao.UserDAO;
import com.api.tss.users.models.Users;
import com.api.tss.users.pojo.UserPojo;
import com.api.tss.users.repo.UserRepository;
import com.api.tss.users.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDao;
	@Autowired
	UserRepository repo;
	
	public boolean userRegistration(UserPojo user) {
		Users u = new Users();
		u.setEmail(user.getEmail());
		u.setMobile(user.getMobile());
		u.setName(user.getName());
		Users u1 = repo.save(u);
		if(u1 != null){
			return true; 
		}
		/*if(userDao.saveUser(u)){
			return true;
		}*/
		
		return false;
	}

}
