package com.aryan.simpleWebApp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @RequestMapping ("/")
    public String greet(){
        return "Hello Good Morning";
    }
    @RequestMapping("/to")
    public String to(){
        return "Aryan";
    }
  @GetMapping("/to/user")
    public Map<String, String> getUser() {
        return Map.of("name", "Aryan", "Techrole", "Developer");
    }
}
