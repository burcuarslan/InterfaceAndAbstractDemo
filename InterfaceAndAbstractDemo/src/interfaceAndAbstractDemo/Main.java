package interfaceAndAbstractDemo;

import java.rmi.RemoteException;


import interfaceAndAbstractDemo.Abstracts.BaseCustomerManager;
import interfaceAndAbstractDemo.Adapters.MernisServiceAdapter;
import interfaceAndAbstractDemo.Concretes.StarbucksCustomerManager;
import interfaceAndAbstractDemo.Entities.Customer;


public class Main {

	public static void main(String[] args) throws RemoteException{
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer=new Customer(1, "BURCU", "ARSLAN", 2001, "10595561114");
    	customerManager.save(customer);   	

	}

}
