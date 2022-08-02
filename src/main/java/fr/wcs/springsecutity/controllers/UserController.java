package fr.wcs.springsecutity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String champion(){
        return  "Avengers... Assemble";
    }


    @GetMapping("/secret-bases")
    public String director(){
        return "https://wildcodeschool.fr/nos-campus/";
    }
}