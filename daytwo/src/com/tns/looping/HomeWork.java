package com.tns.looping;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		System.out.println("\n----------------------------------------------\n");	
		//For loop problem
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	System.out.println("\n----------------------------------------------\n");	
		//Do while loop Problem
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a value of n: ");
		int n=s.nextInt();
		
		do {
			System.out.println(n);
			n--;
		}while(n>=1);

	}

}
