package com.tns.operator;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = s.nextInt();
		String result= (num%2==0)?"Even":"Odd";
		System.out.println("The given num is: "+result);

	}

}
