//program to demonstrate  ArrayIndexOutOfBoundsException
package com.tns.uncheckedexceptions;

public class ArrayOutOfBoundDemo {
	
	static void display(int arr[]) {
		try
		{
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handeled!!! "+e);
		}
		finally
		{
			System.out.println("Finally block is executed....");
		}
		System.out.println("Statement outside the block is always executed...");
		
	}

	public static void main(String[] args) {
		
		int arr[]= {1,2,3};
		display(arr);
		

	}

}
