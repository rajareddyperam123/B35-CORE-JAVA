package org.tnsindia.interfacedemo;

import java.util.Scanner;

//import java.util.scanner

//Implementable class for the Interface
public class Shape {

	
	//void rectangle() ----error 
	public void rectangle() {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the length and breadth of the rectangle");
			int length=s.nextInt();
			int breadth=s.nextInt();
			System.out.println("The area of Rectangle is: "+(length*breadth));
			
			/*Below line if we use here then we can't give the input for another method*/
			//s.close();
		
	}

	public void circle() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius of a circle");
		int radius=s.nextInt();
		System.out.println("The area of Circle is: "+(3.142*radius*radius));
		s.close();
		
	}

}
