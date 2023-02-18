package com.aurionpro.model;

public class Man implements IEmotionable, IMannerable {

	@Override
	public void greetOnArival() {
		System.out.println("Man says Hello");

	}

	@Override
	public void grettOnDeparture() {
		System.out.println("Man says Bye To All");
	}

	@Override
	public void laugh() {
		System.out.println("Man is Laughing on his Own joke");
	}

	@Override
	public void cry() {
		System.out.println("Chad Man does NOT CRY!!");
	}

}
