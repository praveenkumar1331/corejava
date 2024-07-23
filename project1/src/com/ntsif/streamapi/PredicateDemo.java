package com.ntsif.streamapi;
// to demostarte predicate interface

import java.util.function.Predicate;
public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> pr=a->(a>18);  
		System.out.println(pr.test(7));   //creating predicate


	}

}
