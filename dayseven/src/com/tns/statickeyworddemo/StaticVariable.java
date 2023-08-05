package com.tns.statickeyworddemo;
class Employee{
	private int id;
	private String name;
	static String companyName="TNSIF"; //static variable
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	
	void display()
	{
		System.out.println("emp id: "+this.getId()+" "+"emp name: "+this.getName()+" "+"company name: "+this.getCompanyName());
	}
	
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + "]";
//	}
	
	
}

public class StaticVariable {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(1);
		e.setName("Pranav");
		e.display();
		
		Employee e1 = new Employee();
		e1.setId(2);
		e1.setName("Rohit");
		e1.display();
		

	}

}
