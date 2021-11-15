package com.example.abstractfactorydemo;

public class FlyEngine extends Engine {
	
	public FlyEngine() {
		System.out.println("Der FlyEngine wurde erfolgreich erzeugt.");
	}
	@Override
	public void revCouter() {
		System.out.println("Die aktuelle Drehzahl der FlyEngine ist 100 Umdrehungen/Minute.");
	}

}
