//program to demonstrate a user input value
package com.tns.introduction;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str1=s.nextLine();
		System.out.println("String is "+str1);
		
		System.out.println("Enter a Number: ");
		int num= s.nextInt();
		System.out.println("Number is "+num);
		
		System.out.println("Enter a Decimal No.: ");
		float dec=s.nextFloat();
		System.out.println("Decimal no is: "+dec);
		
		System.out.println("Enter a Double No.: ");
		double dub=s.nextDouble();
		System.out.println("Double no is: "+dub);
		
		System.out.println("Enter a word: ");
		char chr=s.next().charAt(1);
		System.out.println("charcter is: "+chr);
		
	}

}
