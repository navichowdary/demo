package com.example.demo.com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.com.service.LoginService;

@Controller
@EnableJpaRepositories
public class LoginController {

	@Autowired
	LoginService login;
	@RequestMapping(value="/init")
	public String display(Model model) {
		System.out.println("Enter web");
		login.access();
		model.addAttribute("message", "Ok");
		return "welcome";
	}
}
