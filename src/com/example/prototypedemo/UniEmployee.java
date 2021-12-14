package com.example.prototypedemo;

public class UniEmployee extends Employee {
	
	private String position;

	public UniEmployee(String firstName, String lastName, Address address, String position) {
		super(firstName, lastName, address);
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "UniEmployee [firstName= " + firstName + ", lastName=" + lastName + ", address=" + address + ", position=" + position + "]";
	}
	
	public UniEmployee clone() throws CloneNotSupportedException {
		return (UniEmployee) super.clone();
	}
	
}
