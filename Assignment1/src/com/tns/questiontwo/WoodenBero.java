package com.tns.questiontwo;

public class WoodenBero extends Bero {
	

	private String woodType;

	//getter-setter
	public String getWoodType() {
		return woodType;
	}

	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}
	
	//constructor
	public WoodenBero(String beroType, String beroColour, String woodType) {
		super(beroType, beroColour);
		this.woodType=woodType;
	}

	@Override
	public void calculatePrice() {
		
		switch(woodType) {
		case "Ply Wood":
			price=15000;
			break;
		case "Teak Wood":
			price=12000;
			break;
		case "Engineered Wood":
			price=10000;
			break;
		
		}
		
	}

}
