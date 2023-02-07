package com.aurionpro.model;

public class Accountant extends Employee {
	private double performanceAllownce ;

	public Accountant(int employeeId, String name, double basicSalary) {
		super(employeeId, name, basicSalary);
		performanceAllownce = 0.15*basicSalary ;
	}

	public double getPerformanceAllownce() {
		return performanceAllownce;
	}

	public void setPerformanceAllownce(double performanceAllownce) {
		this.performanceAllownce = performanceAllownce;
	}

	@Override
	public double calculateAnnualCTC() {

		return getBasicSalary()+performanceAllownce;
	}

}
