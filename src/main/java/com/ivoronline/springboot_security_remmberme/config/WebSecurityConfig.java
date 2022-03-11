package com.ivoronline.springboot_security_remmberme.config;


import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  //PROPERTIES
  private final UserDetailsService userDetailsService;

  //=================================================================
  // CONFIGURE
  //=================================================================
  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {

    //ENABLE REMEMBER ME COOKIE
    httpSecurity.rememberMe().key("something").userDetailsService(userDetailsService);

    //DISABLE CSRF
    httpSecurity.csrf().disable();

    //SECURE EVERYTHING
    httpSecurity.authorizeRequests().anyRequest().authenticated();

    //CUSTOM LOGIN FORM
    httpSecurity.formLogin();

  }

}



