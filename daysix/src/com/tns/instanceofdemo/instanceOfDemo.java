package com.tns.instanceofdemo;

class RBI
{
	protected String ifscCode;
}
class SBI extends RBI
{
	public SBI() {
		super.ifscCode="RBI0NSK01";
		String ifscCode="SBIN00212";
		System.out.println(ifscCode);
		
/*
 * if parent class and child class variable name are same,
 * in such case, use super
 */
	}
}
//program to demonstrate instanceOf operator
public class instanceOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s= new SBI();
		System.out.println(s instanceof SBI);
		System.out.println(s instanceof RBI);

	}

}
