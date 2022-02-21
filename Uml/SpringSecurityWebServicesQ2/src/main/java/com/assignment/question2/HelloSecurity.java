package com.assignment.question2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class HelloSecurity extends WebSecurityConfigurerAdapter {

	// for default username and password to login which is of httpsecurity with
	// different mechanism->>
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		      .csrf().disable()
		      .authorizeRequests()
		      .antMatchers("/hello").permitAll()
//		      .antMatchers("/public/**").permitAll()   //for all which starts with (/public) of user or person 
//		      .antMatchers("/public/**").hasRole("NORMAL")
//		      .anyRequest()
//		      .authenticated()
		      .and()
//		      .httpBasic();
		      .formLogin()
		      .loginPage("/login").permitAll()
		      .loginProcessingUrl("/login")
		      .defaultSuccessUrl("/hello")
		      .and().logout();
//		      .logout().invalidateHttpSession(true)
//		      .clearAuthentication(true)
//		      .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//		      .logoutSuccessUrl("/logout-success").permitAll()
//		      .and()
//		      .httpBasic();
	}

	// for our provided username and password->>
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()

				// 1st user as a normal user
				.withUser("aditya")
//		        .password("0000")-------------------------------------------//this is for plane text password  
				.password(this.passwordEncoder().encode("0000"))           // this is for encrypted password
				.roles("NORMAL")
				.and()

				// 2nd user as a admin
				.withUser("Adam")
//		        .password("1234") ------------------------------------- //this is for plane text password  
				.password(this.passwordEncoder().encode("1234"))       // this is foe encrypted password
				.roles("ADMIN");
	}

// this is for plane text password which is encrypted->>
	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}

	// for encrypted password using bycript
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(10);                    //(10) is a strength of password        
	}

}
