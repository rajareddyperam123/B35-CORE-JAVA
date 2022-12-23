package org.tnsindia.Application;

import org.tnsindia.Framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}

	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + "]";
	}

	
}


