package com.example.mySpringProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/Main")
public class HelloController {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/{text}")
    public String addText(@PathVariable String text){
        return text;
    }

    @GetMapping("/randomNumber-{interval}")
    public int randomNumber(@PathVariable int interval){
        Random rand = new Random();
        return rand.nextInt(interval);
    }

}
