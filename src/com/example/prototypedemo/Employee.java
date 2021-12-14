package com.example.prototypedemo;

public abstract class Employee implements Cloneable {
	
	protected String firstName;
	protected String lastName;
	protected Address address;
	
	public Employee(String firstName, String lastName, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	@Override
	public Employee clone() throws CloneNotSupportedException {
		try {
			// tief kopieren
			Employee tempEmployee = (Employee) super.clone();
			tempEmployee.address = (Address)this.address.clone();
			return tempEmployee;
		}
		catch(CloneNotSupportedException e) {
			System.out.println("Clone of Employee don't work");
		}
		return null;
	}
	

	
	
	
}
