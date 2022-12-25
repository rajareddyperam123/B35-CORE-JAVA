package org.tnsindia.Framework;

public class PrimeAcc {

	//data members
		private boolean isPrime;
		static final private float deliveryCharges=0.0f;

		//constructor
		public PrimeAcc(int accNo, String accNm, float charges,boolean isPrime) {
			super();
			this.isPrime=isPrime;
		}
		public void PrimeAcc11(int accNo, String accNm, float charges, boolean isPrime2) {
			// TODO Auto-generated constructor stub
		}
		public void PrimeAcc111(int accNo, String accNm, float charges, boolean isPrime2) {
			// TODO Auto-generated constructor stub
		}
		public void PrimeAcc1(int accNo, String accNm, float charges, boolean isPrime2) {
			// TODO Auto-generated constructor stub
		}
		public void bookProduct(Class<? extends PrimeAcc> class1)
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
			return "PrimeAcc [isPrime=" + isPrime + "]";
		}
		
		

	}
