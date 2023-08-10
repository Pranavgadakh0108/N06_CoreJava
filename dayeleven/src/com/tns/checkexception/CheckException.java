package com.tns.checkexception;

import java.io.FileInputStream;

public class CheckException {

	public static void main(String[] args) {
		try {
			@SuppressWarnings({ "resource", "unused" })
			FileInputStream f = new FileInputStream("C:\\Users\\PRANAV\\OneDrive\\Desktop\\rohitip.txt");
			System.out.println("File is Found!!!");
		} catch (Exception e) {
			System.out.println("File Does not Exist!!!! "+e);
		}

	}

}
