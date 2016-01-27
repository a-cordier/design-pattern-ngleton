package com.acordier.patterns;

public class App {

	public static void main(String[] args) {
		NGleton one = NGleton.instanceOne;
		NGleton two = NGleton.instanceTwo;
		System.out.println(one.toString());
		System.out.println(two.toString());
		/* nothing stop you from doing this */
		one = two;
		System.out.println(one.toString());
		/* 
		 * But the final stuff is doing the job as
		 * NGleton.instanceOne = NGleton.instanceTwo;
		 * is forbidden
		 */
		
		
		

	}

}
