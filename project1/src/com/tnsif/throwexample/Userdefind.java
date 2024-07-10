package com.tnsif.throwexample;
import java.util.Scanner;

public class Userdefind {
	private static int age;
	
	static void volidate()throws Age{
		Scanner ac =new Scanner (System.in);
		System.out.println("enter you age.......");
		int Age=ac.nextInt();
		if (age<18)
			throw new Age("invaild age, you are not eligiable");
		else
			System.out.println("you can vote.....");
		
		
	}
	public static void main(String[] args)
	{
		try {
			
		}
	}

}
