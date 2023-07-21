package com.tns.introduction;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<=5; i++) {
			System.out.println("*");
		}
		int j = 0;
		while( j <5) {
			System.out.println(j);
			j++;	
		}
		System.out.println("Enter a value: ");
		int k=s.nextInt();
		if(k%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
		System.out.println("Starting val: ");
		int p=s.nextInt();
		System.out.println("Ending val: ");
		int q=s.nextInt();
		do {
			System.out.println(p);
			p++;
		}while(p<=q);

		System.out.println("ENter No: ");
		int date=s.nextInt();
		switch(date) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Friday");
			break;
		default:
			System.out.println("Sunday");
		}
	}

}
