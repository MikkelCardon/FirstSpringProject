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

    @GetMapping("/print:{text}")
    public String printText(@PathVariable String text){
        return text;
    }

    @GetMapping("/randomNumber-{min}-{max}")
    public String randomNumber(@PathVariable("min") int start, @PathVariable("max") int end){
        Random rand = new Random();
        return "Dit tal: " + rand.nextInt(start, end+1);
    }

}
