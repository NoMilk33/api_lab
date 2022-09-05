package com.example.api_lab.controllers;

import com.example.api_lab.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting") //accepts requests to this path
public class GreetingController {

//    @GetMapping
//    public String greeting(@RequestParam(value = "name") String name) {
//        return "Good afternoon " + name + "!";
//    }

    @GetMapping
    public Greeting newGreeting(@RequestParam(value = "timeOfDay") String timeOfDay) {
        return new Greeting("Kat",timeOfDay);
    }
}
