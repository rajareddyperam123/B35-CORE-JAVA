package org.tnsindia.abstractdemo;

public class EmployeePersonExcecutor {
 	public static void main(String[] args) {
		Employee p1=new Employee("Rajareddy","Male",23);
		Employee p2=new Employee("vanaja","Female",-4);
		
		//to return the data that we inserted
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		p1.work();
		p2.work();


	}

}
