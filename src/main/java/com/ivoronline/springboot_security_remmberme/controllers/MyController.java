package com.ivoronline.springboot_security_remmberme.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/hello")
  public String sayHello() {
    return "Message from Controller";
  }

  @RequestMapping("/MyLoginForm")
  public String myLoginForm() {
    return "MyLoginForm";
  }

}
