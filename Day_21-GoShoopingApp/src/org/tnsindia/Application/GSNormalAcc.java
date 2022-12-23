package org.tnsindia.Application;

import org.tnsindia.Framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
	}

	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + "]";
	}

	
	
}


