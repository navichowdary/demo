package com.example.demo.com.entity;

import javax.persistence.Access;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.GenerationType;

@Entity
@Table(name = "EMPLOYEE")
@Access(value=AccessType.FIELD)
public class loginentity {

	public loginentity() {
		System.out.println("entity");
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "name")
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
