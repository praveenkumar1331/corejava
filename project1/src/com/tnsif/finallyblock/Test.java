package com.tnsif.finallyblock;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("100/0");
		}
		catch(ArithmeticException e)
		{
			System.out.println("hello world");
			
		}
			finally
			{
				System.out.println("entered finally");
				
			}
		System.out.println("the endn");

		
	}

}
