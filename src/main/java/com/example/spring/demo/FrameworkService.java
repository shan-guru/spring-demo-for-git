package com.example.spring.demo;


import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
public class FrameworkService {
    public Mono<Framework> fetchFramework(Integer id) {
        Framework framework = null;
        if(id == 100) {
            framework = new Framework(100, "Spring boot");
        }
        return Mono.justOrEmpty(framework);
    }
}
