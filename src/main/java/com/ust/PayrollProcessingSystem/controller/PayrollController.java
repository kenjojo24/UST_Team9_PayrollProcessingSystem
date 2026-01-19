package com.ust.PayrollProcessingSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.PayrollProcessingSystem.model.Payroll;
import com.ust.PayrollProcessingSystem.service.PayrollService;


@RestController
public class PayrollController {
	
	@Autowired
	private PayrollService payrollService;
	
	
	@PostMapping("/save")
	public void savePayroll(@RequestBody Payroll payroll) {
		payrollService.calculate(payroll);
		payrollService.savePayroll(payroll);
	}

}
