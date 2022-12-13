package org.tnsindia.collectiondemo;

import java.util.LinkedHashSet;
//demo on linkedhash set
/*HashSet is an unoder but linkedhashset is an ordered*/
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String>obj=new LinkedHashSet<String>();
		obj.add("raja");
		obj.add("vanaja");
		obj.add("Sun");
		obj.add("Rama");

		System.out.println(obj);
		//to extract the elements from set
		for(String itr:obj)
		{
			System.out.print(itr+" ");
		}



	}

}
