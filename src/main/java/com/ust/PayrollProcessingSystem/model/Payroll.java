package com.ust.PayrollProcessingSystem.model;

public class Payroll {
	private Long id;
	private String name;
	private double basicSalary;
	private double hra;
	private double da;
    private int totalWorkingDays;
    private int presentDays;
    private double grossSalary;
    private double taxPercentage;
    private double taxAmount;
    private double netSalary;
	public Payroll() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payroll(Long id, String name, double basicSalary, double hra, double da, int totalWorkingDays,
			int presentDays, double grossSalary, double taxPercentage, double taxAmount, double netSalary) {
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
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public int getTotalWorkingDays() {
		return totalWorkingDays;
	}
	public void setTotalWorkingDays(int totalWorkingDays) {
		this.totalWorkingDays = totalWorkingDays;
	}
	public int getPresentDays() {
		return presentDays;
	}
	public void setPresentDays(int presentDays) {
		this.presentDays = presentDays;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	public double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
    
}
