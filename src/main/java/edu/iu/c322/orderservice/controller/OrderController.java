package edu.iu.c322.orderservice.controller;

import edu.iu.c322.customerservice.model.Customer;
import edu.iu.c322.customerservice.repository.CustomerRepository;
import edu.iu.c322.orderservice.model.Order;
import edu.iu.c322.orderservice.model.Return;
import edu.iu.c322.orderservice.repository.OrderRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @GetMapping
    public List<Order> findAll() {

        return repository.findAll();
    }

    private OrderRepository repository;

    public OrderController(OrderRepository repository) {
        this.repository = repository;
    }


    @PostMapping
    public int create(@RequestBody Customer customer) {
        return 0;
    }

    public int create(@Valid @RequestBody Order order) {
        return repository.create(order);
    }

    @PutMapping("/return")
    public void update(@Valid @RequestBody Return returna) {
        repository.update(returna);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        repository.delete(id);

    }

}


