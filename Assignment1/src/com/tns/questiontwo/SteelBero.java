package com.tns.questiontwo;

public class SteelBero extends Bero {
	
	private int beroHeight;
	
	//constructor
	public SteelBero(String beroType, String beroColour, int beroHeight) {
		super(beroType, beroColour);
		this.beroHeight=beroHeight;
	}

	//getters-setters
	public int getBeroHeight() {
		return beroHeight;
	}

	public void setBeroHeight(int beroHeight) {
		this.beroHeight = beroHeight;
	}

	@Override
	public void calculatePrice() {
		
		if(beroHeight==3)
		{
			price=5000;
		}
		else if(beroHeight==5)
		{
			price=8000;
		}
		else if(beroHeight==7)
		{
			price=10000;
		}
	}
	
}
