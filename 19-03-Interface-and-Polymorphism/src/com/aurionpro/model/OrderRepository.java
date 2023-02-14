package com.aurionpro.model;

public class OrderRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("order create");

	}

	@Override
	public void read() {
		System.out.println("order read");

	}

	@Override
	public void update() {
		System.out.println("order update");
	}

	@Override
	public void delete() {
		System.out.println("order delete");
	}

}
