package com.meridian.keystone.model;
import jakarta.persistence.*;
import java.util.List;
@Entity
public class Customer {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id;
  public String name; public String email; public String phone; public String orgCode;
  @OneToMany(mappedBy="customer") public List<Site> sites;
  public Long getId(){return id;} public void setId(Long id){this.id=id;}
  public String getName(){return name;} public void setName(String n){this.name=n;}
  public String getEmail(){return email;} public void setEmail(String e){this.email=e;}
  public String getPhone(){return phone;} public void setPhone(String p){this.phone=p;}
  public String getOrgCode(){return orgCode;} public void setOrgCode(String o){this.orgCode=o;}
}
