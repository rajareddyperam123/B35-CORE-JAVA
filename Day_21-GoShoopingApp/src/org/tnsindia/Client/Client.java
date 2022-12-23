package org.tnsindia.Client;

import org.tnsindia.Application.GSNormalAcc;
import org.tnsindia.Application.GSPrimeAcc;
import org.tnsindia.Framework.NormalAcc;
import org.tnsindia.Framework.PrimeAcc;

public class Client {

	public static void main(String[] args) {
		PrimeAcc p=new GSPrimeAcc(1001,"rajareddy",500,true);
		NormalAcc n=new GSNormalAcc(1002,"pranaya",500,70);
		System.out.println("Prime Account Details: ");
		p.bookProduct(p.getClass());
		
		System.out.println();
		
		System.out.println("Normal Account Details: ");
		n.bookProduct(n.getClass());
		
		System.out.println();

		
		System.out.println(p);
		System.out.println(n);

		

	}

}
