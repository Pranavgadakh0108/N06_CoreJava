package com.tns.singledimentionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println("enter a total no.of array element: ");
		int n=s.nextInt();
		//declaration array
		int arr[]= new int[n];
		System.out.println("Enter "+n+" elements: ");
		for(int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("array element are: ");
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		//finding a max element of array
		int max = arr[0];
		for(int i=0; i<n; i++)
		{
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Largest element: "+max);
		
		//sorting arrays element using inbuilt method of Arrays class
		Arrays.sort(arr);
		System.out.println("sorted elements are: ");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
	}

}
