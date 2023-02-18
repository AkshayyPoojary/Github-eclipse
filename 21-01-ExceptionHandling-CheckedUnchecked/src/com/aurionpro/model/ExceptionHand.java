package com.aurionpro.model;

public class ExceptionHand {
	public static void main(String[] args) {
		// ArthematicException --> ilogical maths i.e 12/ 0
		// ArrayOutOfBoundException --> if we does not put required value
		// NumberFormatException --> 12 abc
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println("Input is taken in command line");
			System.out.println(c);

		} 
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (RuntimeException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		//this will print whatever the reason
		finally {
			System.out.println("Finally block is executed");
		}

		// this won't print if there is no specific catch exception
		System.out.println("End of program");
		//but this will execute when we use specific exception
	}
}
