package com.aurionpro.model;

public class BMI {
	private Person person;
	private double bmi;

	public BMI(Person person) {
		super();
		this.person = person;
		this.bmi = calculateBMI(); // assigning method to bmi 

	}

	// method
	private double calculateBMI() {
		return person.getWeight() / (person.getHeight() * person.getHeight());
	}

	// method
	public double getBMI() {
		return bmi;
	}

	// method
	public String getBodyType() {
		if (bmi < 18.5)
			return "Underweight";
		else if (bmi >= 18.5 && bmi < 25)
			return "Healthy Weight";
		else if (bmi >= 25 && bmi <= 29.9)
			return "Overweight";
		else
			return "Obese";

	}

}
