package com.meridian.keystone.repo;
import com.meridian.keystone.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
public interface CustomerRepository extends JpaRepository<Customer, Long> {
  Page<Customer> findByNameContainingIgnoreCase(String name, Pageable p);
}
