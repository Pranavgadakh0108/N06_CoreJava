//program to demonstrate custom exception
package com.tns.customexception;
/*
 * to use custom exception extends ann Exception class(parent)
 */
@SuppressWarnings("serial")
public class LoginCredintials extends Exception{
	
	private String str;

	//parameterised 
	public LoginCredintials(String str) {
		super();
		this.str = str;
	}

	//tostring method
	@Override
	public String toString() {
		return "LoginCredintials [str=" + str + "]";
	}

	//getters setters
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	

}
