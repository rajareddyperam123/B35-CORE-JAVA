package org.tnsindia.instanceofdemo;

import org.tnsindia.inheritancedemo.Animal;

public class InstanceofDemo
{

}
//implementable child class for the abstract class
class Lion extends Animal
{

	void accept() {
		System.out.println("Lion Roars");
	}	
 

	public static void main(String[] args) {
		//Animal l=new Lion();
		Lion l=new Lion();
		l.accept();
		//instanceof operator
		System.out.println(l instanceof Lion);
		System.out.println(l instanceof Animal);

	}

}