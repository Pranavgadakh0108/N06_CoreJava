package com.tns.operator;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		int x=23, y=6;
		System.out.println("result1:");
		int result1=x++ + ++y;
		System.out.println(result1);
		System.out.println(x);
		System.out.println(y);

		System.out.println("result2:");
		int result2=x-- + --y;
		System.out.println(result2);
		System.out.println(x);
		System.out.println(y);

	}

}
