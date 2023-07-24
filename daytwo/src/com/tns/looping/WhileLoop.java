package com.tns.looping;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value of N: ");
		int n = s.nextInt();
		
		while(n>=1) {
			System.out.println(n+" ");
			n--;
		}

	}

}
