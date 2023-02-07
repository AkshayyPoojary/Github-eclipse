package com.aurionpro.model;

public abstract class Employee {                      // Abstract class.
	private int employeeId;
	private String name;
	private double basicSalary;

	public Employee(int employeeId, String name, double basicSalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public abstract double calculateAnnualCTC(); // Abstract method

	// for debug process
	
//	@Override
//	public String toString() {
//		return "Employee [employeeId=" + employeeId + ", name=" + name + ", basicSalary=" + basicSalary + "]";
//	}
	
	
}

