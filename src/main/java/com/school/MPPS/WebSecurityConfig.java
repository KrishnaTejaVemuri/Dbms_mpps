package com.school.MPPS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired	
	UserDetailsService userDetailsService;
	@Autowired
    AuthSuccessHandler customSuccessHandler;
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception 
	{			 
	 auth.userDetailsService(userDetailsService).passwordEncoder(passwordencoder());
		
	}	
	
 
//,"/Messstock/**","/Healthlog/**","/Mppsexam/**","/Scholarship/**","/Prevschool/**","/Gaurdian/**","/cmr/**","/Middaymeals/**","/esr/**","/Mppsstaff/**"
	@Override
	protected void configure(HttpSecurity http) throws Exception {

	  http.authorizeRequests()
		.antMatchers("/admin**","/authorityvisit/**","/Cashssa/**","/Teacherleave/**","/user/**","/Mppsteacher/update/**","/Mppsteacher/delete/**").access("hasRole('ROLE_ADMIN')")
		.antMatchers("/client**").access("hasRole('ROLE_CLIENT')")
		.antMatchers("/employee*","/").access("hasRole('ROLE_EMPLOYEE') or hasRole('ROLE_ADMIN')")
		.anyRequest().permitAll()
		.and()
		  .formLogin().loginPage("/login")	
		  .defaultSuccessUrl("/")
		  .successHandler(customSuccessHandler)
		  .usernameParameter("username").passwordParameter("password")		  
		.and()
		  .logout().logoutUrl("/logout").logoutSuccessUrl("/logout-success")	
		 .and()
		 .exceptionHandling().accessDeniedPage("/login")
		.and()
		  .csrf().disable();
	}

	

	
	@Bean(name="passwordEncoder")
    public PasswordEncoder passwordencoder(){
    	return new BCryptPasswordEncoder();
    }
}
