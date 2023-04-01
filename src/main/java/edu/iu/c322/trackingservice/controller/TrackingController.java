package edu.iu.c322.trackingservice.controller;

import edu.iu.c322.customerservice.model.Customer;
import edu.iu.c322.customerservice.repository.CustomerRepository;
import edu.iu.c322.invoiceservice.model.Invoice;
import edu.iu.c322.invoiceservice.repository.InvoiceRepository;
import edu.iu.c322.orderservice.model.Order;
import edu.iu.c322.orderservice.model.Return;
import edu.iu.c322.orderservice.repository.OrderRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trackings")
public class TrackingController {
    @GetMapping
    public List<Invoice> findAll() {

        return repository.findAll();
    }

    private InvoiceRepository repository;

    public TrackingController(InvoiceRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{id}")
    public Invoice getInvoice(@Valid @PathVariable int id){
        return repository.getInvoice(id);

    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id,@RequestBody String status) {
        repository.update(id,status);

    }

}

