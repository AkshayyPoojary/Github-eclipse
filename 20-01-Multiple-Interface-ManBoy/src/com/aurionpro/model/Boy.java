package com.aurionpro.model;

public class Boy implements IMannerable {

	@Override
	public void greetOnArival() {
		System.out.println("Boy says Hello");
	}

	@Override
	public void grettOnDeparture() {
		System.out.println("Boy says Sayonara");
	}

}
