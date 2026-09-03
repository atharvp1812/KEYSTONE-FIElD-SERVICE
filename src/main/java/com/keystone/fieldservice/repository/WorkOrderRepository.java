package com.keystone.fieldservice.repository;
import com.keystone.fieldservice.model.WorkOrder;
import org.springframework.data.jpa.repository.JpaRepository;
public interface WorkOrderRepository extends JpaRepository<WorkOrder, Long> {}
