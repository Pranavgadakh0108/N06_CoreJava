package com.tns.superdemo;
//program to demonstrate on super keyword with variable
class Building{
	
	int floors=23;
	String name="MET BKc";
}
class Flat extends Building{
	
	String name="Rohit ";
	
	void print()
	{
		/*
		 * if parent class and child class variable name are same
		 * and if you want to access parent class variable inside
		 * child class, use super.variablename
		 */
		System.out.println(super.name);
		System.out.println(name);
	}
}
public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		Flat f = new Flat();
		
		f.print();

	}

}
