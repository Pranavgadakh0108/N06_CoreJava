//driver class
//program to demonstrate on class and object

package com.tns.classandobject;


public class EmployeeExecuter {

	public static void main(String[] args) {
		//object creation
		Employee e = new Employee();
		e.empID=12345;
		e.empName="Pranav";
		e.salary=200;
		e.department="CS";
		
		//method call
		e.display();

	}

}
