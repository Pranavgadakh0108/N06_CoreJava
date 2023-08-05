package com.tns.superdemo;
//program to demonstrate on super constructor
//parent class
class Google{
	String ceo;

	public Google(String ceo) {
		System.out.println("constructor: "+ceo);
	}
	
}
//child class
class GMail extends Google{
	String userid;

	public GMail(String ceo, String userid) {
		//calling to parent class parameterized constructor
		super(ceo);
		this.userid = userid;
		System.out.println(userid);
	}
	
}
public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		GMail g= new GMail("Rohit","Topper@gmail.com");
	}

}
