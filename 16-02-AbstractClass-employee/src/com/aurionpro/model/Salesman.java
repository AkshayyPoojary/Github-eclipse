package com.aurionpro.model;

public class Salesman extends Employee {
public Salesman(int employeeId, String name, double basicSalary) {
		super(employeeId, name, basicSalary);
		bonus = basicSalary*0.30;
	}

private double bonus =0.30;

public double getBonus() {
	return bonus ;
}

public void setBonus(double bonus) {
	this.bonus = bonus;
}

@Override
public double calculateAnnualCTC() {
	
	return getBasicSalary()+bonus;
}
}
