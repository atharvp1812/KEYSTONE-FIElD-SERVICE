package com.meridian.keystone.model;
import jakarta.persistence.*;
@Entity
public class Role {
  @Transient public static final Role MANAGER = new Role("MANAGER");
  @Transient public static final Role TECHNICIAN = new Role("TECHNICIAN");
  @Transient public static final Role CUSTOMER = new Role("CUSTOMER");
  @Transient public static final Role ADMIN = new Role("ADMIN");
  @Transient public static final Role DISPATCHER = new Role("DISPATCHER");

  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id;
  public String name;

  public Role() {}
  public Role(String name){this.name=name;}

  public Long getId(){return id;} public void setId(Long id){this.id=id;}
  public String getName(){return name;} public void setName(String n){this.name=n;}
}
