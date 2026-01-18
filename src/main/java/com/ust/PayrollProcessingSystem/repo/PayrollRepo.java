package com.ust.PayrollProcessingSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.PayrollProcessingSystem.model.Payroll;

public interface PayrollRepo extends JpaRepository<Payroll, Long>{

}
