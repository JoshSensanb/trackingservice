package edu.iu.c322.customerservice.controller;

import edu.iu.c322.customerservice.repository.CustomerRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import edu.iu.c322.customerservice.model.Customer;

import java.util.List;


@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping
    public List<Customer> findAll(){
        return repository.findAll();
    }
    private CustomerRepository repository;
    public CustomerController(CustomerRepository repository){
        this.repository = repository;
    }




    @PostMapping
    public int create(@Valid @RequestBody Customer customer){
        Customer newCustomer = repository.save(customer);
        return newCustomer.getId();
    }


    @PutMapping("/{id}")
    public void update(@Valid @RequestBody Customer customer, @PathVariable int id){
        customer.setId(id);
        repository.save(customer);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        Customer newCustomer = new Customer();
        newCustomer.setId(id);
        repository.delete(newCustomer);

    }


}
