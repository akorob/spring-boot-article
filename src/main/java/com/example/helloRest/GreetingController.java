package com.example.helloRest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping(value="/greeting", method= RequestMethod.GET)
    public Greeting greeting() {
        return new Greeting(1, "Hello World");
    }
}
