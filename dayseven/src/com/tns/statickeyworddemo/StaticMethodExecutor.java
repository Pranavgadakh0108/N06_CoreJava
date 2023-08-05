package com.tns.statickeyworddemo;

public class StaticMethodExecutor {
	
	String str="MET";
	static float percentage=25.00f;
	
	//static methods
	/*
	 * if any method outside the main function and if you want to 
	 * access that method inside the main function, make it
	 * as static.
	 */

	static void displayScore(int score) {
		System.out.println("percentage is: "+percentage);
		/*
		 * we can't use non static variable inside static method
		 */
		//System.out.println(str);
		
		System.out.println("Score is: "+score);
	}
	public static void main(String[] args) {
		displayScore(90);

	}

}
