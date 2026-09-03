package com.keystone.fieldservice.repository;
import com.keystone.fieldservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {}
