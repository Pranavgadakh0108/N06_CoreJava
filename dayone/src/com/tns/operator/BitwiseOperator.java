//program to demonstrate on bitwise and shifting operator
package com.tns.operator;

public class BitwiseOperator {

	public static void main(String[] args) {
		int x= 8, y= 1;
		
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);
		
		//Right shift
		System.out.println(x>>y);
		//Left shift
		System.out.println(x<<y);

	}

}
