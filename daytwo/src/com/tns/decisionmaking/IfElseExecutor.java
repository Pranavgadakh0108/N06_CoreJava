//program to demonstrate on to check the person eligible to donate blood or not...
package com.tns.decisionmaking;

import java.util.Scanner;

public class IfElseExecutor {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int age= s.nextInt();
		System.out.println("Enter Your Weight: ");
		int weight=s.nextInt();
		
		if(age>18 && weight>50) {
			System.out.println("You are Eligible to donate blood!!!");
		}
		else {
			System.out.println("You not Eligible!!!!!");
		}

	}

}
