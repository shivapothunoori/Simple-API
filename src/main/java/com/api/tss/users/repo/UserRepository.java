package com.api.tss.users.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.api.tss.users.models.Users;

@Repository
public interface UserRepository extends MongoRepository<Users, String>{

}
