package edu.iu.c322.trackingservice.controller;


import edu.iu.c322.trackingservice.model.Invoice;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/tracking")
public class TrackingController {

    /*
    This should connect to our invoice database, but I'm not sure how to do it.
     */
    private final WebClient repository;

    public TrackingController(WebClient.Builder webClientBuilder) {
        this.repository = webClientBuilder.baseUrl("http://localhost:8080").build();
    }

    @GetMapping("/invoice/{id}")
    public String getStatus(@PathVariable int id){
        Invoice i = repository.get().uri("{id}",id).retrieve().bodyToMono(Invoice.class).block();
        return i.status();
    }


}

