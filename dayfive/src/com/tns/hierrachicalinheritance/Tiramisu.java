package com.tns.hierrachicalinheritance;

public class Tiramisu extends Android{

	private int version; 
	
	//parameterised constructor
	public Tiramisu(String brand, String slotType, int version) {
		super(brand, slotType);
		this.version=version;
	}

	//getters setters
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}
	
	

}
