package com.meridian.keystone.controller;
import com.meridian.keystone.model.Customer;
import com.meridian.keystone.repo.CustomerRepository;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/customers")
public class CustomerController {
  private final CustomerRepository repo;
  public CustomerController(CustomerRepository r){this.repo=r;}
  @GetMapping public Page<Customer> list(@RequestParam(required=false) String q, @RequestParam(defaultValue="0") int page, @RequestParam(defaultValue="10") int size){
    Pageable p=PageRequest.of(page,size,Sort.by("name"));
    return (q==null||q.isBlank())?repo.findAll(p):repo.findByNameContainingIgnoreCase(q,p);
  }
  @PostMapping public Customer create(@RequestBody Customer c){return repo.save(c);}
}