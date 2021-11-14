package com.example.singletondemo;

public class BasicSingleton {
	
	private static final BasicSingleton instance = new BasicSingleton();
	
	private BasicSingleton() {
		System.out.println("Das BasicSingleton Objekt wurde erzeugt.");
	}

	public static BasicSingleton getInstance() {
		return instance;
	}
}
