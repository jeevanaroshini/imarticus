package com.dbs.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@RequestMapping("/home")
	public String home() {
		return "Welcome to home page";
	}
	@RequestMapping("/user")
	public String user() {
		return "Welcome to user page";
	}
	@RequestMapping("/admin")
	public String admin() {
		return "Welcome to admin page";
	}
}
