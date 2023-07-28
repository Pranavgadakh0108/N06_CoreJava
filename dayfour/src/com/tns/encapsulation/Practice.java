package com.tns.encapsulation;

class ERP{
	private long id;
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ERP [id=" + id + ", name=" + name + "]";
	}	
	
}

public class Practice {

	public static void main(String[] args) {
		
		ERP e= new ERP();
		e.setId(123456789L);
		e.setName("Pratik Gadakh");
		
		System.out.println(e);
		
		
	}

}
