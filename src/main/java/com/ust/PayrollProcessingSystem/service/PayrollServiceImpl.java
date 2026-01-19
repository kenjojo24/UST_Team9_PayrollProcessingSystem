package com.ust.PayrollProcessingSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.PayrollProcessingSystem.model.Payroll;
import com.ust.PayrollProcessingSystem.repo.PayrollRepo;

@Service
public class PayrollServiceImpl implements PayrollService {
	
	@Autowired
	private PayrollRepo payrollRepo;
	
	public Payroll calculate(Payroll payroll) {
		Double gross = (payroll.getBasicSalary() + payroll.getHra() + payroll.getDa()) / payroll.getTotalWorkingDays() * payroll.getPresentDays();
		Double tax = gross * payroll.getTaxPercentage() / 100;

		payroll.setGrossSalary(gross);
		payroll.setTaxAmount(tax);
		payroll.setNetSalary(gross - tax);

	    return payroll;	
	}
	
	public Payroll savePayroll(Payroll payroll) {
		return payrollRepo.save(payroll);
	}
	
}
