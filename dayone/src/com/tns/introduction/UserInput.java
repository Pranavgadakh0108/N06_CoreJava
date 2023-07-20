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
		
	}

}
