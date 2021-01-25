package com.ivoronline.springboot_security_remmberme.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {

    //DISABLE CSRF
    httpSecurity.csrf().disable();

    //SPECIFY ACCESS TO ENDPOINTS
    httpSecurity.authorizeRequests()
      .antMatchers("/hello").hasRole("USER");

    //CUSTOM LOGIN FORM
    httpSecurity.formLogin()
      .loginPage("/MyLoginForm")
      .loginProcessingUrl("/login");

  }

}

