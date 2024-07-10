package com.tnsif.exceptionhandling;
import java.util.InputMismatchException;

public class Exampledivision {
	public static void divide() {
		int a=6,b=0,c;
		
		try {
			c=a/b;
			System.out.println("division "+c);
		}
		
		catch(InputMismatchException e) {
			System.out.println("exception caught"+e.getMessage());
		}
	catch(ArithmeticException e) {
		System.out.println("exception caught"+e.getMessage());
		}
		
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception caught"+e.getMessage());
		}
		catch (ExceptionInInitializerError e) {
          System.out.println("exception caught"+e.getMessage());
		}}}
	




	
	
		

