//program to demonstrate interface
package com.tns.interfacess;

public interface SONY {
	/*
	 * by default all the variable inside an interface
	 * is public static final
	 */
	int noOfChannels=6;
	//by default method inside an interface is an abstract method
	void display();
	/*
	 * java 8 provides a static and default method inside an interface
	 */
	//static method
	static void accept()
	{
		System.out.println("static method");
	}
	//default method
	default void show()
	{
		System.out.println("default method");
	}

}
