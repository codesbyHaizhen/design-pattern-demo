package com.example.abstractfactorydemo;

public abstract class Regulator {
	private double currentVoltage;  //aktuelle Spannung
	private double currentCurrent;  //aktuelle Strom
	
	public abstract void increaseVoltage();

	public double getCurrentVoltage() {
		return currentVoltage;
	}

	public void setCurrentVoltage(double currentVoltage) {
		this.currentVoltage = currentVoltage;
	}

	public double getCurrentCurrent() {
		return currentCurrent;
	}

	public void setCurrentCurrent(double currentCurrent) {
		this.currentCurrent = currentCurrent;
	}
}
