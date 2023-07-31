package com.tns.thiskeyword;

class Team{
	int size;
	Team()
	{	
		//calling parameterized constructor
		this(10);
		System.out.println("default constructor");
	}
	Team(int size)
	{
		System.out.println("parameterised constructor: "+size);
	}
}
public class ThisKeywordDemoThree {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Team t= new Team();

	}

}
