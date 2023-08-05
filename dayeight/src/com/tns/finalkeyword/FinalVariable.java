package com.tns.finalkeyword;

public class FinalVariable {

	/*Final variable must be initialize during declaration*/
	//final int x;
	
	final float SALARY = 65889989.0f;
	
	void print() {
		// we cant change the value
		//SALARY = 47856938.0F;
		System.out.println("Salary : " + SALARY);
	}
	
	
}
