package com.jpa.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.jpa.security.service.DBSDetailsService;

@Configuration
@EnableWebSecurity
public class DBSSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	DBSDetailsService dbsDetailsService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception{
		auth.userDetailsService(dbsDetailsService);
	}
	@Override
	protected void configure (HttpSecurity http)throws Exception{
		http.httpBasic().and().authorizeRequests()
		.antMatchers("/admin").hasAuthority("admin")
		.antMatchers("/user").hasAnyAuthority("admin","user")
		.antMatchers("/home").permitAll();		
	}
	
}
