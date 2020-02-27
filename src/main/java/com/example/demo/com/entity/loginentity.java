package com.example.demo.com.entity;

import org.springframework.stereotype.Component;

@Component
public class loginentity {

	public loginentity() {
		System.out.println("entity");
	}
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
}
