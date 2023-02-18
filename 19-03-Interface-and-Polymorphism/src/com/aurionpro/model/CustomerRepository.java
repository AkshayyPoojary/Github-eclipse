package com.aurionpro.model;

public class CustomerRepository implements IRepository {

	// implementing properties from interface IRepository.java

	@Override
	public void create() {
		System.out.println("Customer created an product detail");
	}

	@Override
	public void read() {
		System.out.println("Customer read the product detail");
	}

	@Override
	public void update() {
		System.out.println("Customer updated the details");
	}

	@Override
	public void delete() {
		System.out.println("Customer deleted the details");

	}

}
