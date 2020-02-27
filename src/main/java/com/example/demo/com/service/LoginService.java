package com.example.demo.com.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

	private LoginService() {
		System.out.println("serice");
	}
	public void access() {
		System.out.println("close");
	}
}
