//program to demonstrate switch case statement for song selection
package com.tns.decisionmaking;

import java.util.Scanner;

public class SwitchExecutor {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a song number: ");
		int songno = s.nextInt();
		
		switch(songno)
		{
		case 1:
			System.out.println("Waka Waka");
			break;
			
		case 2:
			System.out.println("Taki Taki");
			break;
			
		case 3:
			System.out.println("Jai shree ram");
			break;
			
		default:
			System.out.println("Sorry!!! No Song");
		}

	}

}
