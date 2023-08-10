
package com.tns.wrapperclass;
/*
 * autoboxing :conversion of primitive to object type
 */
public class Autoboxing {

	public static void main(String[] args) {
		int num=100;
		//converting a primitive type to object
		Integer value=num;
		System.out.println(value);
		System.out.println(value.getClass().getName());

	}

}
