package com.example.spring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/tech/api/v1")
public class TechWorldController {

    @GetMapping("/list/frameworks")
    public Flux<String> listFramworks(){
        return Flux.just("Java",
                "Spring boot",
                "Weblux");
    }
}
