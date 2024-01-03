package com.spring.WebApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.WebApp.Model.UserDTO;
import com.spring.WebApp.dao.MyDAO;

@Service
public class MyService {

	@Autowired
	MyDAO dao;

	public boolean register(UserDTO dto) {

		if (dto.getId() > 100) {
			return dao.register(dto);
		} else {
			return false;
		}
	}

}
