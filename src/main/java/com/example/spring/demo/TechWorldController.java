package com.example.spring.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/tech/api/v1")
public class TechWorldController {

    private FrameworkService service;

    public TechWorldController(FrameworkService service) {
        this.service = service;
    }


    @GetMapping("/list/frameworks")
    public Flux<String> listFramworks() {
        return Flux.just("Java",
                "Spring boot",
                "Weblux");
    }

    @GetMapping("/list/list-front-end")
    public Flux<String> listFrontend() {
        return Flux.just("Angular 14",
                "View JS",
                "React JS");
    }

    @GetMapping("/framework/{id}")
    public Mono<ResponseEntity<Framework>> getFramework(@PathVariable("id") Integer id) {
        return service.fetchFramework(id)
                .map(framework -> ResponseEntity
                        .ok()
                        .body(framework))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }


}
