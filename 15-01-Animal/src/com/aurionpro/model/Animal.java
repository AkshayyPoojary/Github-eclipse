package com.aurionpro.model;

public class Animal {
	private String name;
	private boolean isCarnivorous;

	// constructor
	public Animal(String name, boolean isCarnivorous) {
		super();
		this.name = name;
		this.isCarnivorous = isCarnivorous;
	}

	// method
	public void eat() {
		System.out.println("Animal eats..");
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", isCarnivorous=" + isCarnivorous + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCarnivorous() {
		return isCarnivorous;
	}

	public void setCarnivorous(boolean isCarnivorous) {
		this.isCarnivorous = isCarnivorous;
	}

}
