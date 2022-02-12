package com.example.teste01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.teste01.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {	
	

}
