package com.plezidevops;

public class Car {
	// properties
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	
	public Car() {
		this("closed", "on", "seated", 100);
	}
	
	public Car(String doors, String engine, String driver, int speed) {
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public String run() {
		if (this.doors.equals("closed") && this.engine.equals("on") && 
				this.driver.equals("seated") && this.speed > 0) {
			return "running";
		}
		return "not running";
	}

}

