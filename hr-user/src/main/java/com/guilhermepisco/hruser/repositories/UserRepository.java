package com.guilhermepisco.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermepisco.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
