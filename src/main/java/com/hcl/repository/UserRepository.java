package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
	public User findByUsernameAndPassword(String username, String password);

	
}
