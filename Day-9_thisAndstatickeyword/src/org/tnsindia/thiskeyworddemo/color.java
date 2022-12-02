package org.tnsindia.thiskeyworddemo;

public class color {

public String name;
	
	//default constructor
	void Color()
	{
		VOIDthis("BLUE");//invoking paramterized constructor
		System.out.println("Default Constructor");
	}
	private void VOIDthis(String string) {
		// TODO Auto-generated method stub
		
	}
	//paramterized constructor
	void Color(String name)
	{
		System.out.println("The color is: "+name);
	}

}
