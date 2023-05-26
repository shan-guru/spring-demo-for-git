package com.example.spring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/demo-v2/api/v1")
public class BeautifulWorldController {

    @GetMapping("/places")
    public Flux<String> beautifulPlaces() {

        List<String> list = List.of("Zhangye Danxia Geopark, China",
                "Venice, Italy",
                "Banff National Park, Canada",
                "Great Ocean Road, Australia",
                "Machu Picchu",
                "Pamukkale, Turkey",
                "Japan in Cherry Blossom Season",
                "Marrakesh, Morocco"
        );

        list.add("Bora Bora, French Polynesia");
        list.add("Oia, Santorini, Greece");
        list.add("Mù Cang Chải, Vietnam");
        list.add("Tamil Nadu, India");


        return Flux.fromIterable(list);
    }
}
