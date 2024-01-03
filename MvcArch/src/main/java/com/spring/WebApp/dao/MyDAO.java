package com.spring.WebApp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.WebApp.Model.UserDTO;
import com.spring.WebApp.service.MyService;

@Repository
public class MyDAO {
	
	@Autowired
	MyService service;

	public boolean register(UserDTO dto) {
		return true;
	}

}
