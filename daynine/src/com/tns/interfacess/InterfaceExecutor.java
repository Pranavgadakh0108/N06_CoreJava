package com.tns.interfacess;
//driver class
public class InterfaceExecutor {

	public static void main(String[] args) {
		//we can't create the object of interface
		//SONY s= new SONY();
		
		SONYSUB s= new SONYSUB();
		s.display();
		s.show();
		SONY.accept();
		
		Isro i= new Isro();
		i.status();

	}

}
