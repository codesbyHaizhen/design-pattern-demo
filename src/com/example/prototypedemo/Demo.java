package com.example.prototypedemo;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		UniEmployee employeeNr1 = new UniEmployee("John","Schmidt",new Address("Waldallee",8,"82222"),"Professor");
		UniEmployee employeeNr2 = employeeNr1.clone();
		
		System.out.println(employeeNr1);
		System.out.println(employeeNr2);
		
		employeeNr2.lastName = "Müller";
		employeeNr2.address = new Address("Ravensburger Ring", 31, "87777");
		
		employeeNr1 = employeeNr2.clone();
		
		System.out.println(employeeNr1);
		System.out.println(employeeNr2);
		

	}

}
