package com.tnsif.staticmethod;

public class Student {
	int rollno;
	String name;
	static String college="sri indu";
	static void change() {
		college="IIT";
		
	}
	Student (int r, String n){
		rollno =r;
		name=n;
		
		
	}
    void display() {
    	System.out.println(rollno+" "+name+" "+college);
    	
    }
	

}
