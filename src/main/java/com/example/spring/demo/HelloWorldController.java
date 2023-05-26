package com.example.spring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/demo/api/v1")
public class HelloWorldController {

    @GetMapping("/numbers")
    public Flux<Integer> listNumbers() {
        return Flux.just(1,2,3,4);
    }

}
