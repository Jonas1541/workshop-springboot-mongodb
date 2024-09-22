package com.jonasdurau.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jonasdurau.workshopmongo.models.User;

public interface UserRepository extends MongoRepository<User, String>{
    
}
