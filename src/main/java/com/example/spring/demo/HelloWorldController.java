package com.example.spring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/hello/api/v1")
public class HelloWorldController {


    @GetMapping("/greetings/v3")
    public Flux<String> listGreetingsAnother() {
        return Flux.just("Good morning", "Welcome", "Beautiful evening!");
    }

}
