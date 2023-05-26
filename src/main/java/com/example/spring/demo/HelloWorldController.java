package com.example.spring.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
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

    @GetMapping("/greetings")
    public Flux<String> listGreetings() {
        return Flux.just("Good morning",
                "Welcome",
                "Beautiful evening!");
    }

    @GetMapping("/greetings/v2")
    public Flux<Greeting> greetingFlux() {
        Greeting greeting1 = new Greeting("Mike", "I hope you're having a great week");
        Greeting greeting2 = new Greeting("Jacob", "I'm reaching out because");
        Greeting greeting3 = new Greeting("Williams", "I hope you're having a wonderful day");
        Greeting greeting4 = new Greeting("Nathan", "I hope this email finds you well");

        return Flux.just(greeting1, greeting2, greeting3, greeting4);
    }

}

@AllArgsConstructor
@Data
class Greeting {
    private String name;
    private String message;

    @Override
    public String toString() {
        return "Greeting{" +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
