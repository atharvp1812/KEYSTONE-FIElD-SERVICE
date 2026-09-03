package com.keystone.fieldservice.controller;
import com.keystone.fieldservice.model.Site; import com.keystone.fieldservice.repository.SiteRepository;
import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/sites")
public class SiteController {
 private final SiteRepository repo; public SiteController(SiteRepository r){this.repo=r;}
 @GetMapping public List<Site> all(){return repo.findAll();}
 @PostMapping public Site create(@RequestBody Site s){return repo.save(s);}
}
