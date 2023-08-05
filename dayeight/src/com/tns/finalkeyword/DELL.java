package com.tns.finalkeyword;

public class DELL extends Laptop {
	final String processor = "Intel i7";
		
		//we can't override final method
	//	void display() {
	//		System.out.println(processor);
	//	}
		
		
		//we can overload final method
		void display(String processor) {
			System.out.println(processor);
		}

}
