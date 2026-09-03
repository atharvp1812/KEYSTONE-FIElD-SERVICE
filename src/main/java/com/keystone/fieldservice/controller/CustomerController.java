package com.keystone.fieldservice.controller;
import com.keystone.fieldservice.model.Customer; import com.keystone.fieldservice.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/customers")
public class CustomerController {
 private final CustomerRepository repo; public CustomerController(CustomerRepository r){this.repo=r;}
 @GetMapping public List<Customer> all(){return repo.findAll();}
 @PostMapping public Customer create(@RequestBody Customer c){return repo.save(c);}
}
