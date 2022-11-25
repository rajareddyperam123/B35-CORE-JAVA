package org.tnsindia.inheritancedemo;

import java.util.Scanner;

public class multilevelInheritanceDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		//vehicle name-Parent 1
		System.out.println("Enter the vehicle name:");
		String veh_name=s.nextLine();
		Tyre t=new Tyre();
		t.setName1(veh_name);
		t.display3();
		
		//brand-Parent2 and Child1
		System.out.println("Enter the vehicle brand name:");
		String brand=s.nextLine();
		t.setName1(brand);
		t.display3();
		
		//tyre-child class2
		System.out.println("Enter the tyre name:");
		String t_name=s.nextLine();
		t.setTyre_name(t_name);
		t.display3();
		
		
		

	}

}
