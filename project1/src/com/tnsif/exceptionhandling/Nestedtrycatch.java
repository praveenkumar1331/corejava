package com.tnsif.exceptionhandling;

public class Nestedtrycatch {
	public static void check ()
	{
		String str="TNS";
		int slength=str.length();
		
		System.out.println("string length"+slength);
		
		String anotherstring=null;
		int y=6;
		try {
			try {
				System.out.println(str.charAt(y));
	
				
				
			}
			catch(StringIndexOutOfBoundsException ex) {
				System.out.println("indexout of bound except");
				
			}
			System.out.println(" string length"+anotherstring);
			
			
		}
		catch (NullPointerException npe) {
			String getMeggage;
			System.out.println("exception is thrown"+npe.getMessage());
			
			
		}
		
		
	}

}
