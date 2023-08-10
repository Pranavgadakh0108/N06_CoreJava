package com.tns.uncheckedexceptions;

public class ThrowAndThrowsKeywordDemo {
	
	static void isEligible(int age, int weight) {
		if(age>18 && weight>50)
		{
			System.out.println("Eligible to donate blood...");
		}
		else
			//throw keyword is used to throw an exception explicitly
			throw new ArithmeticException("Not Eligiblie....");
	}

	public static void main(String[] args) {
		
		try
		{
			isEligible(11,55);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
//if catch= black color output
//if throw= red color output