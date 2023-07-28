//program to demonstrate on encapsulation
/*encapsulation achieve data hiding using private access specifier*/
package com.tns.encapsulation;

public class Sbi {
	
	//private data member
	private String accType;
	private long accountNo;
	private long atmCardNo;
	private int pinNo;
	
	//getters and setters method
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public long getAtmCardNo() {
		return atmCardNo;
	}
	public void setAtmCardNo(long atmCardNo) {
		this.atmCardNo = atmCardNo;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	@Override
	public String toString() {
		return "Sbi [accType=" + accType + ", accountNo=" + accountNo + ", atmCardNo=" + atmCardNo + ", pinNo=" + pinNo
				+ "]";
	}
	
	
	

}
