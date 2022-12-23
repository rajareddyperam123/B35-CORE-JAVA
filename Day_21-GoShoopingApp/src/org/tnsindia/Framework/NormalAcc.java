package org.tnsindia.Framework;

public class NormalAcc {

	private final float deliveryCharges;

	public NormalAcc(int accNo, String accNm, float charges,float deliveryCharges) {
		super();
		this.deliveryCharges=deliveryCharges;
	}
	
	public void bookProduct(Class<? extends NormalAcc> class1)
	{
		System.out.println("Account no.is: "+this.getAccNo()+" "+
				"Account name is: "+this.getAccNo()+" "+
				"Charges is: "+(deliveryCharges+deliveryCharges));
	}

	private String getAccNo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
	}
	
	

}
