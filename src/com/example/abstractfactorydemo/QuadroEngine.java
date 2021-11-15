package com.example.abstractfactorydemo;

public class QuadroEngine extends Engine {
	
	public QuadroEngine() {
		System.out.println("Der QuadroEngine wurde erfolgreich erzeugt.");
	}
	@Override
	public void revCouter() {
		System.out.println("Die aktuelle Drehzahl der QuadroEngine ist 300 Umdrehungen/Minute.");
	}

}
