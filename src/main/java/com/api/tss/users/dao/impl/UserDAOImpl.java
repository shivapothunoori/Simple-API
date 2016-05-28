package com.api.tss.users.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.tss.users.dao.UserDAO;
import com.api.tss.users.models.Users;
import com.api.tss.users.repo.UserRepository;

public class UserDAOImpl implements UserDAO {

	@Autowired
	UserRepository repo;
	
	
	public boolean saveUser(Users user) {
		// TODO Auto-generated method stub
		
		Users user1 = null;// repo.save(user);
		System.out.println("user entity" + user1);
		if(user1 != null){
			return true;
		}
		
		return false;
	}

}
