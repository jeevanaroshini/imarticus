package com.mvc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.demo.dto.UserDTO;
import com.mvc.demo.service.DBSService;

@Controller
public class DBSController {
	@Autowired
	DBSService ser;
	
	@RequestMapping("/")
	public String home() {
		return "Login.jsp";
	}
	@GetMapping("/login")
	public String loginPage(UserDTO user,Model model) {
		System.out.println("Username-->"+user.getUserName());
		System.out.println("Password-->"+user.getPassword());
		if(ser.checkLoginUser(user.getUserName(),user.getPassword())==true)
		return "home.jsp";
		else
			model.addAttribute("message", "invalid credentials")
	}
}
