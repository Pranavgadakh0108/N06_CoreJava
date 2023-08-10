//program to demonstrate on Array of Object
package com.tns.singledimentionalarray;
//driver class
public class ArrayOfObjects {

	public static void main(String[] args) {
		Employees arr[]= new Employees[3];
		arr[0]=new Employees(101,"Pranav",73672.2);
		arr[1]=new Employees(102,"Rohit",88999.2);
		arr[2]=new Employees(103,"Shubham",73122.2);
		
		for(int i=0; i<3; i++) {
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
		}
		
		
	}

}
