package com.tns.finalkeyword;

//Program to demonstrate on final method
//Parent class

//Final class can't be inherit from child class
//public class final laptop
public class Laptop {

	final String processor = "Intel i5";
	
	//final method
	final void display() {
		System.out.println(processor);
	}
}
