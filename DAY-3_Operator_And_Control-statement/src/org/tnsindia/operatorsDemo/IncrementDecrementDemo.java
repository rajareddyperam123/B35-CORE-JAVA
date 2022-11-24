package org.tnsindia.operatorsDemo;

import java.util.Scanner;

public class IncrementDecrementDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		int a=s.nextInt();//5
		int b=s.nextInt();//2
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(8>>1);
		System.out.println(8<<1);
		s.close();

	}

}
