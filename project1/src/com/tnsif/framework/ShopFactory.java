package com.tnsif.framework;

public interface ShopFactory 
{
	public PrimeAcc getNewPrimeAccount(int accno,String accNm,float charges,boolean isPrime);
	public NormalAcc getNewNormalAccount(int accno,String accNm,float charges,float deliverycharges);
}
	
	
	
