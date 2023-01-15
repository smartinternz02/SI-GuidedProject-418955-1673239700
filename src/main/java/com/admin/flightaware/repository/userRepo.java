package com.admin.flightaware.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.flightaware.models.User;
import com.admin.flightaware.models.UserIp;


public interface userRepo extends JpaRepository<User,Long> {

	User findByEmailIdIgnoreCase(String email);
	

}