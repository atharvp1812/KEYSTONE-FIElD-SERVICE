package com.keystone.fieldservice.service;
import com.keystone.fieldservice.model.*;
import com.keystone.fieldservice.repository.WorkOrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class WorkOrderService {
 private final WorkOrderRepository repo;
 public WorkOrderService(WorkOrderRepository repo){ this.repo=repo; }
 public List<WorkOrder> findAll(){ return repo.findAll(); }
 public WorkOrder findById(Long id){ return repo.findById(id).orElseThrow(()->new RuntimeException("WorkOrder not found")); }
 public WorkOrder create(WorkOrder wo){ wo.setStatus(WorkOrderStatus.ASSIGNED); return repo.save(wo); }
 public WorkOrder updateStatus(Long id, WorkOrderStatus newStatus){
  WorkOrder wo = findById(id);
  WorkOrderStatus current = wo.getStatus();
  if(current==WorkOrderStatus.COMPLETED) throw new RuntimeException("Cannot change COMPLETED work order");
  if(current==WorkOrderStatus.ASSIGNED && newStatus!=WorkOrderStatus.IN_PROGRESS) throw new RuntimeException("ASSIGNED can only go to IN_PROGRESS");
  if(current==WorkOrderStatus.IN_PROGRESS && newStatus!=WorkOrderStatus.COMPLETED) throw new RuntimeException("IN_PROGRESS can only go to COMPLETED");
  wo.setStatus(newStatus);
  return repo.save(wo);
 }
}
