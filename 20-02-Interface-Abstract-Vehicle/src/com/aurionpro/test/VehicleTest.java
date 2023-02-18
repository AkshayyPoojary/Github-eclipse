package com.aurionpro.test;

import com.aurionpro.model.Bike;
import com.aurionpro.model.Bus;
import com.aurionpro.model.Car;
import com.aurionpro.model.IMovable;

public class VehicleTest {
	public static void main(String[] args) {
		IMovable[] moveables = { new Car("Maruti"), new Bus("TATA"), new Bike("Honda") };
		startMoving(moveables);
	}

	private static void startMoving(IMovable[] moveables) {

//		for(int i=0;i<moveables.length;i++) {
//			moveables[i].move();                                //  ------> Basic
//		}

		
		// type + obj: + nameOfArray
		for (IMovable i : moveables) {
			i.move();
		}
	}

}
