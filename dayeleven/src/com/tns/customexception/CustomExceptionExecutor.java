package com.tns.customexception;

import java.util.Scanner;

public class CustomExceptionExecutor {

	public static void main(String[] args) throws LoginCredintials {
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your userid: ");
		String userid = s.nextLine();
		System.out.println("Enter your password: ");
		String password = s.nextLine();
		
		
		if(userid.equals("pranav") && password.equals("1234#"))
		{
			System.out.println("Credentials are matched....");
		}
		else
		{
			throw new LoginCredintials("Invalid Credintials...!!!");
		}
	}

}
