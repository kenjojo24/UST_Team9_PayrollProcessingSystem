package com.ust.PayrollProcessingSystem.service;

import com.ust.PayrollProcessingSystem.model.Payroll;

public interface PayrollService {
	public Payroll savePayroll(Payroll payroll);
	public Payroll calculate(Payroll payroll);
}
