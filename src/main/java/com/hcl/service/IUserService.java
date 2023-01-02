package com.hcl.service;

import org.springframework.stereotype.Service;

import com.hcl.entity.User;

@Service
public interface IUserService {
	
	public void addUser(User user);
	
	public void delete(String username);
	
	public User find(String username);
	
	public User find(String username, String password);

}
