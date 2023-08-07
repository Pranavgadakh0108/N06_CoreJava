package com.tns.interfacess;

public class Human implements ColdDrink, AlcoholDrink {

	@Override
	public void showdrink() {
		System.out.println(coldDrinkName+" "+alcoholType+" "+brand);
		
	}

}
