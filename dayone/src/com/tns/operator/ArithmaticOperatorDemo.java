
//program to demonstrate arithmetic operator
package com.tns.operator;

import java.util.Scanner;

public class ArithmaticOperatorDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a num1: ");
		int num1= s.nextInt();
		System.out.println("Enter a num2: ");
		int num2= s.nextInt();
		
		System.out.println("Addition is "+ (num1+num2));
		System.out.println("Subtraction is "+ (num1-num2));
		System.out.println("Multiplication is "+(num1*num2));
		System.out.println("Division is "+(num1/num2));
		System.out.println("Modulous is "+(num1%num2));
		

	}

}
