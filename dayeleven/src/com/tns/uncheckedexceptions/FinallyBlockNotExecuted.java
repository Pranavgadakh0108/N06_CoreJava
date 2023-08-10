package com.tns.uncheckedexceptions;

public class FinallyBlockNotExecuted {
	static void display(int arr[]) {
		try
		{
			System.out.println(arr[3]);
			/*
			 * if try and catch block contains a System.exit(0)
			 * after the exception code line, then finally block
			 * does not executed and also not any statement
			 */
			System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handeled!!! "+e);
			System.exit(0);
		}
		finally
		{
			/*
			 * when finally block contains an exception code the
			 * finally block does not executed
			 * 
			 */
			//System.out.println(13/0);
			System.out.println("Finally block is executed....");
		}
		System.out.println("Statement outside the block is always executed...");
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3};
		display(arr);
		

	}

}
