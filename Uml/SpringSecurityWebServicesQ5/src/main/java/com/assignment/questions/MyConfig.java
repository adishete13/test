package com.assignment.questions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class MyConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("aditya")
		.password("0000")
		.roles("ADMIN");
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http 
		    .csrf().disable()
		    .authorizeRequests().antMatchers("/hello")
		    .hasRole("ADMIN")
		    .and()
		    .formLogin().loginPage("/login")
		    .loginProcessingUrl("/login")
		    .defaultSuccessUrl("/hello")
		    .permitAll()
		    .and()
		    .logout()
		    .and()
		    .rememberMe();
		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	

}
