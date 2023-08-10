//program to demonstrate multiple exception in one catch block
package com.tns.uncheckedexceptions;

public class CatchBlockDemo {
	
	static void print (int arr[]) {
		try
		{
			System.out.println(arr[3]);
		}
		//we can use multiple catch block in program
		catch(ArithmeticException | NullPointerException e) {
			
			System.out.println(e);
			
		}
		catch(Exception e) {
			System.out.println("Exception Handeled!!!! "+e);
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {12,2,14};
		print(arr);

	}

}
