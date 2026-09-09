package com.keystone.fieldservice.model;
import jakarta.persistence.*;
@Entity public class Customer { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @Column(nullable=false) private String name; private String email; private String phone; public Long getId(){return id;} public void setId(Long id){this.id=id;} public String getName(){return name;} public void setName(String n){this.name=n;} public String getEmail(){return email;} public void setEmail(String e){this.email=e;} public String getPhone(){return phone;} public void setPhone(String p){this.phone=p;} }
