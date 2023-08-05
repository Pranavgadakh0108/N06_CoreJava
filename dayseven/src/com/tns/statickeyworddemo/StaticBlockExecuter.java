//program to demonstrate on static block
package com.tns.statickeyworddemo;

public class StaticBlockExecuter {
	String str;
	static float salary;
	/*
	 * static block is used to initialize static variable
	 * and we can't initialize any non static variable inside
	 * the static block
	 */
	
	static {
		salary=1233.2f;
		//str="pranav";
		System.out.println(salary);
	}
	
	static void print() {
		System.out.println("salary is: "+salary);
	}

	public static void main(String[] args) {
		/*
		 * main function is static and hence it calls static blocks
		 * and methods and variable by default
		 */
		print();
	}

}
