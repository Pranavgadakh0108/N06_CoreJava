package com.tns.singleinheritance;

class GrandParent{
	
				private String home;
			
				public String getHome() {
					return home;
				}
			
				public void setHome(String home) {
					this.home = home;
				}
			
				public GrandParent(String home) {
					super();
					this.home = home;
				}
			
				@Override
				public String toString() {
					return "GrandParent [home=" + home + "]";
				}
	
	
}

class Parent extends GrandParent{
	
	
			private int property;
			private String car;
			
			
			public int getProperty() {
				return property;
			}
		
		
			public void setProperty(int property) {
				this.property = property;
			}
		
		
			public String getCar() {
				return car;
			}
		
		
			public void setCar(String car) {
				this.car = car;
			}
		
		
			public Parent(String home, int property, String car) {
				super(home);
				
				this.property=property;
				this.car=car;
			}


			@Override
			public String toString() {
				return "Parent [property=" + property + ", car=" + car + ", toString()=" + super.toString() + "]";
			}
			
			
	
}

class Child1 extends Parent{
	
			private int age;
			
			public int getAge() {
				return age;
			}
		
			public void setAge(int age) {
				this.age = age;
			}
		
			public Child1(String home, int property, String car, int age) {
				super(home, property, car);
				this.age=age;
			}
		
			@Override
			public String toString() {
				return "Child1 [age=" + age + ", toString()=" + super.toString() + "]";
			}
	
}

class Child2 extends Parent{

			private int age;
			
			public int getAge() {
				return age;
			}
		
			public void setAge(int age) {
				this.age = age;
			}
		
			public Child2(String home, int property, String car, int age) {
				super(home, property, car);
				this.age=age;
			}
		
			@Override
			public String toString() {
				return "Child2 [age=" + age + ", toString()=" + super.toString() + "]";
			}
				
}
public class Inheritance {

	public static void main(String[] args) {
		System.out.println("\n-------------------------------single Inheritance--------------------------------\n");
		//single Inheritance
		Parent p= new Parent("2BHK",1234,"BMW");
		System.out.println(p);
		System.out.println("\n----------------------------Multilevel Inheritance--------------\n");
		//Multilevel Inheritance
		Child1 c= new Child1("3BHK",12345,"Audi",21);
		System.out.println(c);
		System.out.println("\n----------------------------Hierarchical Inheritance-------------\n");
		//Hierarchical Inheritance
		Child1 c1= new Child1("4BHK",1234567,"BMW",21);
		Child2 c2= new Child2("1BHK",123456,"TATA",18);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("\n---------------------------------------------------------------\n");
		
	}

}
