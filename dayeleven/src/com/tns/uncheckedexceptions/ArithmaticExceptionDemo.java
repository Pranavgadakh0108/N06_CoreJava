package com.tns.uncheckedexceptions;

import java.util.Scanner;

public class ArithmaticExceptionDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number1: ");
		int x= s.nextInt();
		System.out.println("enter a number2: ");
		int y= s.nextInt();
		//try block contains an exception code
		try {
			System.out.println(x/y);
		}
		//catch block is used to handle that exception
		catch(Exception e){
			System.out.println("Exception Handeled!!!"+e);
		}

	}

}
