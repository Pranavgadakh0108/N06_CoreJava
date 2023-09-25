package com.tns.questiontwo;
/*
 * This method is used to calculate the discount for the bero objects 
 * and return the discount amount
 */
public class Discount {
	
	public double calculateDiscount(Bero bObj) {
		
		if (bObj instanceof SteelBero)
		{
	        return (bObj.getPrice() * 10) / 100;
	    } else if (bObj instanceof WoodenBero) 
	    {
	        return (bObj.getPrice() * 15) / 100;
	    } else 
	    {
	        return 0;
	    }
	}
	

}
