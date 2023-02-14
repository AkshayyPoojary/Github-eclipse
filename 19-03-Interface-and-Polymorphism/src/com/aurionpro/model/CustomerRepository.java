package com.aurionpro.model;

public class CustomerRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("Customer create");
	}

	@Override
	public void read() {
		System.out.println("Customer read");
	}

	@Override
	public void update() {
		System.out.println("Customer update");
	}

	@Override
	public void delete() {
		System.out.println("Customer delete");

	}

}
