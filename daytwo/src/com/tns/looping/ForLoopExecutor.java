//program to demonstrate for loop for star pattern
package com.tns.looping;

import java.util.Scanner;

public class ForLoopExecutor {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value of N: ");
		int n = s.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
