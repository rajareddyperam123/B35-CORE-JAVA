package org.tnsindia.collectiondemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String>obj=new Stack<>();
		//insertion
		obj.push("raja reddy");
		obj.push("vanaja");
		obj.push("kavitha");
		obj.push("vijay");
		System.out.println(obj);
		//remove-LIFO
		obj.pop();
		System.out.println(obj);


	}

}
