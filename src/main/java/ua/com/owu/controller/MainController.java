package ua.com.owu.controller;


import org.springframework.stereotype.Controller;

import javax.persistence.Entity;

@Controller
public class MainController {

    @GetMapping("")
    public String  toIndex(){


        return "index";
    }
}
