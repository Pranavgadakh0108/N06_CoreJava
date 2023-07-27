//program to demonstrate on default and parameterised constructor
//driver class
package com.tns.classandobject;

public class LibraryExecutor {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Library l = new Library();
		Library P = new Library(1,"Pranav Gadakh","Java Programming",250.50);
		System.out.println(P);

	}

}
