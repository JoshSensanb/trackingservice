package edu.iu.c322.customerservice.repository;

import edu.iu.c322.customerservice.model.Customer;
import jakarta.validation.Valid;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;



import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {



}
