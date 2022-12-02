package org.tnsindia.finalkeyworddemo;
/*final method is inherited but can't override*/
public interface FinalMethodWithChild {


	public static final String PAN_no = "";
	public static final long aadhar_no = 0;

	/*if we use final keyword with method then method override is not
	 * possible
	 * 
	 */
	
	
	//method overriding
	/*public void print()
	{
		System.out.println("PAN no.is: "+PAN_no);
		super.print();
	}*/
	

	//method overloading
	public default void print(String PAN_NO)
	{
		System.out.println("PAN no.is: "+PAN_no);
	}

}