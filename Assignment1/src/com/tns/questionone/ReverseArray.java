/*
 * Q.1 Mary is good in mathematics. She is always playful and has a good memory.
 * When her friend Pinky tells n numbers, she has a habit of telling all those
 * numbers in the reverse order of what she told. Please help her friend to find 
 * if the order in which Mary says are correct or not.
 */

package com.tns.questionone;

import java.util.*;

public class ReverseArray {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=s.nextInt();
		int arr[]= new int[n];
		System.out.println("Numbers said by Pinky: ");
		for(int i=0; i<n; i++) {
			 arr[i]=s.nextInt();
		}
		
		int reverse_arr[]= new int[n];
		System.out.println("Numbers said by Mary: ");
		for(int i=0; i<n; i++) {
			 reverse_arr[i]=s.nextInt();
		}
		
		int j=0, k=n-1;
		
		for(j=0; j<n; j++) {
			if(reverse_arr[j] != arr[k])
			{
				System.out.println("No, it is not in reverse order");
				break;
			}
			
			k--;
		}
		
		if(j==n)
		System.out.println("Yes, it is in reverse order");
	}

}
