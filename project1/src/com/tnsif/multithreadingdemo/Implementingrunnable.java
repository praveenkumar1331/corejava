package com.tnsif.multithreadingdemo;

public class Implementingrunnable implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementingrunnable r=new Implementingrunnable();
		//new state
		
		//r.start();
		Thread t1=new Thread(r);
		t1.start();
	}

	@Override
	public void run() {
		System.out.println("implementing runnable interface");


	}

}
