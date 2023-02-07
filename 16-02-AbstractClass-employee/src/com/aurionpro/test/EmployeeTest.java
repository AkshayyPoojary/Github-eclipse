package com.aurionpro.test;

import com.aurionpro.model.Accountant;
import com.aurionpro.model.Manager;
import com.aurionpro.model.Salesman;

public class EmployeeTest {
public static void main(String[] args) {
	Manager man = new Manager(1001,"akshay",20000);
	printSalaryDetails(man);
	//debug purpose
//	System.out.println(man);
//	System.out.println(man.calculateAnnualCTC());
	
	Salesman sale = new Salesman(1002,"thappa",10000);
	printSalaryDetails(sale);
	
	Accountant acc = new Accountant(1003,"rahul",15000);
	printSalaryDetails(acc);
	
}


private static void printSalaryDetails(Manager man) {

	System.out.println("Managers employee-id is: "+man.getEmployeeId());
	System.out.println("Managers name is: "+man.getName());
	System.out.println("Managers Salary is: "+man.getBasicSalary());
	System.out.println("Managers Annual CTC is: "+man.calculateAnnualCTC());
	System.out.println("---------------------------------------------------------");
	
}
private static void printSalaryDetails(Salesman sale) {

	System.out.println("Salesman employee-id is: "+sale.getEmployeeId());
	System.out.println("Salesman name is: "+sale.getName());
	System.out.println("Salesman Salary is: "+sale.getBasicSalary());
	System.out.println("Salesman Annual CTC is: "+sale.calculateAnnualCTC());
	System.out.println("---------------------------------------------------------");
	
}
private static void printSalaryDetails(Accountant acc) {

	System.out.println("Accountant employee-id is: "+acc.getEmployeeId());
	System.out.println("Accountant name is: "+acc.getName());
	System.out.println("Accountant Salary is: "+acc.getBasicSalary());
	System.out.println("Accountant Annual CTC is: "+acc.calculateAnnualCTC());
	System.out.println("---------------------------------------------------------");
	
}
}
