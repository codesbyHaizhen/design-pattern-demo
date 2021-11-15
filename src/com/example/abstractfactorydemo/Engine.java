package com.example.abstractfactorydemo;

public abstract class Engine {
	private double engineSpeed; //Drehzahl des Motors
	
	public abstract void revCouter(); //Drehzahlmesser

	public double getEngineSpeed() {
		return engineSpeed;
	}

	public void setEngineSpeed(double engineSpeed) {
		this.engineSpeed = engineSpeed;
	}
}
