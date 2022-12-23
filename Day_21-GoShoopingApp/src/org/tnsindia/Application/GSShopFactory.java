package org.tnsindia.Application;

import org.tnsindia.Framework.NormalAcc;
import org.tnsindia.Framework.PrimeAcc;
import org.tnsindia.Framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc p=new GSPrimeAcc(accNo,accNm,charges,isPrime);
		return p;
	}

	@Override
	public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAcc n=new GSNormalAcc(accNo,accNm,charges,deliveryCharges);
		return n;
	}

}
