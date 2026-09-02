package com.meridian.keystone.model;
import jakarta.persistence.*;
@Entity
public class Site {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id;
  public String name; public String address;
  @ManyToOne @JoinColumn(name="customer_id") public Customer customer;
  public Long getId(){return id;} public void setId(Long id){this.id=id;}
  public String getName(){return name;} public void setName(String n){this.name=n;}
  public String getAddress(){return address;} public void setAddress(String a){this.address=a;}
  public Customer getCustomer(){return customer;} public void setCustomer(Customer c){this.customer=c;}
}
