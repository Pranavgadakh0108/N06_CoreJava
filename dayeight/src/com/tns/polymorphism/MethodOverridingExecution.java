// Program to demonstrate on method overriding
package com.tns.polymorphism;

class CheifMinister{
	static void corruption(String str1, float amount1) {
		System.out.println(str1 + " Currupted the amount of " + amount1);
	}
}


class MLA extends CheifMinister{
	static void corruption(String str2, float amount2) {
		CheifMinister.corruption("Eknath Shinde ",365236.90f);
		System.out.println(str2 + " Currupted the amount of " + amount2);
	}
}

public class MethodOverridingExecution {

	public static void main(String[] args) {
		MLA.corruption("Chetan", 10000.09f);

	}

}
