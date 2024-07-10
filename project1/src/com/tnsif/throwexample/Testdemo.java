package com.tnsif.throwexample;

import java.util.Scanner;

public class Testdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		System.out.println("enter the roll no");
		int rollno= sc.nextInt();
		
		if(rollno<0) {
		throw new ArithmeticException("rollno cannot be print"); 

	}
	else {
		System.out.println("rollno is valid");
	}

	}}
