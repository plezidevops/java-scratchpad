package com.plezidevops;

public class Main {

	public static void main(String[] args) {
		Car car  = new Car();
		Car car2 = new Car("closed", "off", "seated", 100);
		
		System.out.println(car.run());
		System.out.println(car2.run());

	}

}
