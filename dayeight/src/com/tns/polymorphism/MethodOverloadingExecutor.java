//program to demonstrate method overloading
package com.tns.polymorphism;

class bollywood{
	static String showCouple(String str1, String str2)
	{
		return str1+ " Loves "+ str2;
	}
	
	static String showCouple(String str1, String str2, String str3)
	{
		return str1+ " Loves "+ str2+" as well as "+str3;
	}
}
public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		
		System.out.println(bollywood.showCouple("Salman", "aishwarya"));
		System.out.println(bollywood.showCouple("Salaman", "aishwarya", "katrina"));

	}

}
