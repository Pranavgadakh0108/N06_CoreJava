//program to demonstrate on:
//this keyword is used to refer current instance of the class
package com.tns.thiskeyword;
class Account{
	long accountNo;
	void setData(long accountNo)
	{
		this.accountNo=accountNo;
	}
	void display()
	{
		System.out.println(accountNo);
	}
}
public class ThisKeywordDemoOne {

	public static void main(String[] args) {
		Account a = new Account();
		//a.accountNo=123456L;
		a.setData(123456789L);
		a.display();
		

	}

}
