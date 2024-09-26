package com.jonasdurau.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonasdurau.workshopmongo.models.User;
import com.jonasdurau.workshopmongo.repositories.UserRepository;
import com.jonasdurau.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
