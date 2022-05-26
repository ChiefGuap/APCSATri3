package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class TestPhpForm {
    @GetMapping("/testphp")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String testphpform() {
        return "testphpform"; // returns HTML VIEW (greeting)
        
    } 
}

