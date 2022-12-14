package org.tnsindia.Enumdemo;
//we can implements interface using enum
public enum EnumCards {
//Enum constants
	HEART,CLUB,DIAMOND,SPADES;

	public void accept() {
		System.out.println("Selected shape in the cards are: "+this);
		
	}

}

