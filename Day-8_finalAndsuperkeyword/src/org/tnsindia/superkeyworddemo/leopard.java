package org.tnsindia.superkeyworddemo;
//child class
public class leopard {

public String name="Leopard";
	
	leopard()
	{
		//by default it will call to parent class constructor
		//super();
		System.out.println("Child constructor");
	}
	
	public void accept()
	{
		System.out.println("Child class with "+name);
		
		//super keyword for parent class variable
		//super keyword for parent class method
		
	}

	

}
