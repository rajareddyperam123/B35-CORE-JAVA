package org.tnsindia.Multithreading;

//demo on multithread

public class MultiThreadingDemo {

	public static void main(String[] args) {
		Thread t1=new Thread("Thread1");
		Thread t2=new Thread("Thread2");
		t1.start();
		t2.start();
		
		System.out.println(t2.getName());
		System.out.println(t1.getPriority());
		
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		

	}

	public void run() {
		// TODO Auto-generated method stub
		
	}
	

}
