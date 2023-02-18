package com.aurionpro.test;

import com.aurionpro.model.CustomerRepository;
import com.aurionpro.model.IRepository;
import com.aurionpro.model.OrderRepository;
import com.aurionpro.model.ProductRepositroy;

public class RepositoryTest {
	public static void main(String[] args) {
		ProductRepositroy pd = new ProductRepositroy();
		doDBOperations(pd);

		CustomerRepository cd = new CustomerRepository();
		doDBOperations(cd);

		OrderRepository od = new OrderRepository();
		doDBOperations(od);
	}

	// method
	private static void doDBOperations(IRepository id) {
		// calling parent type object interface i.e IRepository.java
		id.create();
		id.read();
		id.update();
		id.update();

	}
}
