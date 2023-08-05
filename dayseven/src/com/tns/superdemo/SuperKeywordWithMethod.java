package com.tns.superdemo;
//parent class
class MET{
	String ownerName="Chagan Bhujbal";
	void display()
	{
		System.out.println("Owner is: "+ownerName);
	}
}
//child class
class BKC extends MET{
	String ownerName="Shefali Bhujbal";
	void display()
	{
		/*
		 * if parent class and child class method name are same,
		 * and if you want to access that method inside
		 * child class, then use
		 * super.methodName();
		 */
		super.display();
		System.out.println("Owner is: "+ownerName);
	}
}
//driver class
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		BKC b = new BKC();
		b.display();

	}

}
