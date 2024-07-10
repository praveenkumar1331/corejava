package com.tnsif.exceptionhandling;

public class main {
	public static void main(String[] args) {
		
		int d=0;
		try
		{
			int a=50/0;
			System.out.println("hello");
			
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception caught");
			
			
		}
	}

}
