package com.tns.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		Sbi s=new Sbi();
		//setting a value to private data members
		s.setAccType("Saving Account");
		s.setAccountNo(123456778L);
		s.setAtmCardNo(987654321L);
		s.setPinNo(1234);
		
		//below line will call toString() method
		//System.out.println(s);
		
		System.out.println("Account Type is: "+s.getAccType());
		System.out.println("Account no is: "+s.getAccountNo());
		System.out.println("ATM no is: "+s.getAtmCardNo());
		System.out.println("Pin no is: "+s.getPinNo());

	}

}
