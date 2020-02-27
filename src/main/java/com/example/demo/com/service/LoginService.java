package com.example.demo.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import com.example.demo.com.entity.loginentity;
import com.example.demo.com.repositary.ProductRepositary;

@Component
@EnableJpaRepositories
public class LoginService {

	@Autowired
	ProductRepositary repo;
	private LoginService() {
		System.out.println("serice");
	}
	public void access() {
		loginentity l = new loginentity();
		l.setId(69);
		l.setName("Naveen");
		repo.save(l);
		System.out.println("close");
	}
}
