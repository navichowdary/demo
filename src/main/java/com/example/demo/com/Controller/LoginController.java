package com.example.demo.com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.com.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService login;
	@RequestMapping(value="/init")
	public String display() {
		System.out.println("Enter web");
		login.access();
		return "welcome";
	}
}
