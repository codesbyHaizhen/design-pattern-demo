package com.example.factorydemo;

public abstract class Logistics {
	protected abstract Transport transportFactory(String transportType);
	
	public Transport manageTransportForCustomer(String transportType) {
		Transport transport = transportFactory(transportType);
		
		transport.collectProductsFromCustomer();
		transport.transportProducts();
		
		return transport; 
	}
}
