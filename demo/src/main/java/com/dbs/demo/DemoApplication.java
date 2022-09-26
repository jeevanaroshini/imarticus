package com.dbs.demo;
import java.lang.String;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/dbs")
@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@RequestMapping("/home")
	public String m1(@RequestParam String userName,@RequestParam String password) {
		return "<h1><i>home of "+userName+" your password is "+password+" </h1>";
	}
	@RequestMapping("/welcome/{userName}/{password}")
	public String m2(@PathVariable String userName,@PathVariable String password) {
		return "<h1><i>Welcome "+userName+" your password is "+password+" </h1>";
	}
	/*
	@RequestMapping("welcome/shariq/goodboy")
	public String m1() {
		return "another page";
	}*/
	
}
