package com.tnsif.multithreadingdemo;

public class Extendingthread extends Thread {
	public void run() {     // running state
		System.out.println("hello");
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Extendingthread e=new Extendingthread();// new state
		
		e.start();// runnable state
		
		


	}

}
