package com.tns.classandobject;

class Student{
	int id;
	String name;
	float sgpa;
	
	public Student() {
		System.out.println("Default Constructor ");
	}

	public Student(int id, String name, float sgpa) {
		super();
		this.id = id;
		this.name = name;
		this.sgpa = sgpa;
		
		System.out.println("Parameterized constructor");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sgpa=" + sgpa + "]";
	}
	
}

public class Practice {

	public static void main(String[] args) {
		Student s1= new Student();
		Student s2= new Student(1,"Pranav",7.2f);
		
		System.out.println(s2);
		
		
	}

}
