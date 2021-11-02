package com.example.factorydemo;

public class Demo {
	public static void main(String[] args) {
		Logistics logisticsSoftware = new SeaStreetFlightLogistics();
		Transport seaTransport = logisticsSoftware.manageTransportForCustomer("sea");
		
	}
}
