package com.yangsh.mercury.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
public class HomeController {

  @RequestMapping(value = "/", method = GET)
  public String home() {
    
    System.out.println("HomeController return view name.");
    return "home";
  }

}
