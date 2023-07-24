//program to demonstrate on bunjee jumping using nested if 
package com.tns.decisionmaking;

import java.util.Scanner;

public class NestedIfExecutor {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int age= s.nextInt();
		System.out.println("Enter Your Weight: ");
		int weight=s.nextInt();
		
		if(age>=12)
		{
			if(weight>=40)
			{
				System.out.println("Eligible for bunjee jumping");
				if(weight>110)
				{
					System.out.println("Extra ropes will be added");
				}
			}
			else
			{
				System.out.println("Not Eligible");
			}
		}
		else
		{
			System.out.println("Not Eligible");
		}

	}

}
