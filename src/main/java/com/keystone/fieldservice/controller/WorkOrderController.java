package com.keystone.fieldservice.controller;
import com.keystone.fieldservice.model.*;
import com.keystone.fieldservice.service.WorkOrderService;
import org.springframework.web.bind.annotation.*;
import java.util.List; import java.util.Map;
@RestController @RequestMapping("/api/work-orders")
public class WorkOrderController {
 private final WorkOrderService service;
 public WorkOrderController(WorkOrderService s){ this.service=s; }
 @GetMapping public List<WorkOrder> all(){ return service.findAll(); }
 @GetMapping("/{id}") public WorkOrder one(@PathVariable Long id){ return service.findById(id); }
 @PostMapping public WorkOrder create(@RequestBody WorkOrder wo){ return service.create(wo); }
 @PatchMapping("/{id}/status") public WorkOrder updateStatus(@PathVariable Long id, @RequestBody Map<String,String> body){
  WorkOrderStatus status = WorkOrderStatus.valueOf(body.get("status"));
  return service.updateStatus(id, status);
 }
}
