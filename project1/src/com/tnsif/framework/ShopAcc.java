package com.tnsif.framework;

public abstract class ShopAcc {
	
	private int AccNo;
	private String accNm;
	private float charges;
	
	public ShopAcc(int AccNo, String accNm, float charges) {
		super();
		this.AccNo = AccNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	public int getAccNO() {
		return AccNo;
	}
	public void setAccNO(int accNO, int AccNo) {
		this.AccNo = AccNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	abstract public void bookproduct(float charges);
	@Override
	public String toString() {
		return "ShopAcc [AccNO=" + AccNo + ", accNm=" + accNm + ", charges=" + charges + ", getAccNO()=" + getAccNO()
				+ ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
