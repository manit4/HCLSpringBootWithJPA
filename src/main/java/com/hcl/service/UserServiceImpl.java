package com.hcl.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.entity.User;
import com.hcl.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	UserRepository repository;

	@Override
	public void addUser(User user) {
		
		repository.save(user);	
	}

	@Override
	public void delete(String username) {
		
		repository.deleteById(username);
		
	}

//	@Override
//	public User find(String username) {
//		
//		User user = null;
//		
//		Optional<User> optional = repository.findById(username);
//		
//		if(optional.isPresent()) {
//			user = optional.get();
//		}
//		
//		return user;
//	}
//	
	
	@Override
	public User find(String username) {
		
		User user = null;
		
		Optional<User> optional = repository.findById(username);
		
		if(optional.isPresent()) {
			
			user = optional.get();
		}
		
		return user;
	}
	
	@Override
	public User find(String username, String password) {
		
		User user = repository.findByUsernameAndPassword(username, password);
		
		return user;
	}
	
	

}
