package com.aurionpro.model;

public class ProductRepositroy implements IRepository {

	// implementing properties from interface IRepository.java

	@Override
	public void create() {
		System.out.println("Product is created ");

	}

	@Override
	public void read() {
		System.out.println("Product is read ");

	}

	@Override
	public void update() {
		System.out.println("Product is updated ");
	}

	@Override
	public void delete() {
		System.out.println("Product is deleted ");

	}

}
