package com.baba.flightaware.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.baba.flightaware.models.User;
import com.baba.flightaware.models.UserIp;


public interface userRepo extends JpaRepository<User,Long> {

	User findByEmailIdIgnoreCase(String email);
	

}