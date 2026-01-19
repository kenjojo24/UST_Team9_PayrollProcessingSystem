package com.ust.PayrollProcessingSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Payroll_Info")
public class Payroll {
	
	@Id
	private Long id;
	private String name;
	private Double basicSalary;
	private Double hra;
	private Double da;
    private Integer totalWorkingDays;
    private Integer presentDays;
    private Double grossSalary;
    private Double taxPercentage;
    private Double taxAmount;
    private Double netSalary;
	public Payroll() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payroll(Long id, String name, Double basicSalary, Double hra, Double da, Integer totalWorkingDays,
			Integer presentDays, Double grossSalary, Double taxPercentage, Double taxAmount, Double netSalary) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.da = da;
		this.totalWorkingDays = totalWorkingDays;
		this.presentDays = presentDays;
		this.grossSalary = grossSalary;
		this.taxPercentage = taxPercentage;
		this.taxAmount = taxAmount;
		this.netSalary = netSalary;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(Double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public Double getHra() {
		return hra;
	}
	public void setHra(Double hra) {
		this.hra = hra;
	}
	public Double getDa() {
		return da;
	}
	public void setDa(Double da) {
		this.da = da;
	}
	public Integer getTotalWorkingDays() {
		return totalWorkingDays;
	}
	public void setTotalWorkingDays(Integer totalWorkingDays) {
		this.totalWorkingDays = totalWorkingDays;
	}
	public Integer getPresentDays() {
		return presentDays;
	}
	public void setPresentDays(Integer presentDays) {
		this.presentDays = presentDays;
	}
	public Double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public Double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(Double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	public Double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}
	public Double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(Double netSalary) {
		this.netSalary = netSalary;
	}
    
}
