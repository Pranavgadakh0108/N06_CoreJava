//program to demonstrate on cascaded if else statement
package com.tns.decisionmaking;

import java.util.Scanner;

public class CascadaedIfElseExecutor {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Age1: ");
		int age1= s.nextInt();
		System.out.println("Enter Your Age2: ");
		int age2= s.nextInt();
		System.out.println("Enter Your Age3: ");
		int age3= s.nextInt();
		
		if(age1>age2 && age1>age3)
		{
			System.out.println("Age1 is Greater: "+age1);
		}
		else if(age2>age1 && age2>age3)
		{
			System.out.println("Age2 is Greater: "+age2);
		}
		else
		{
			System.out.println("Age3 is greater: "+age3);
		}

	}

}
