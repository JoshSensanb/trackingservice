package edu.iu.c322.trackingservice.controller;


import edu.iu.c322.trackingservice.model.Invoice;
import edu.iu.c322.trackingservice.repository.TrackingRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import javax.sound.midi.Track;
import java.util.Optional;

@RestController
@RequestMapping("/tracking")
public class TrackingController {

    /*
    This should connect to our invoice database, but I'm not sure how to do it.
     */
    private final TrackingRepository trackingRepository;

    public TrackingController(TrackingRepository trackingRepository) {
        this.trackingRepository = trackingRepository;
    }

    @GetMapping("/invoice/{id}")
    public String getStatus(@PathVariable int id){
        Optional<Invoice> i = trackingRepository.findById(id);
        Invoice invoice = i.get();
        return invoice.status();
    }


}

