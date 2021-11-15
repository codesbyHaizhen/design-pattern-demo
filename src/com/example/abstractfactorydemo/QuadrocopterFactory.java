package com.example.abstractfactorydemo;

public abstract class QuadrocopterFactory {
	public abstract Regulator createRegulator();
	public abstract Engine createEngine();
}
