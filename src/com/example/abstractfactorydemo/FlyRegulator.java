package com.example.abstractfactorydemo;

public class FlyRegulator extends Regulator {
	public FlyRegulator() {
		System.out.println("Der FlyRegulator wurde erfolgreich erzeugt.");
	}
	@Override
	public void increaseVoltage() {
		System.out.println("Die Spannung des QuadroRegulator wurde um 30V erhöht.");
	}

}
