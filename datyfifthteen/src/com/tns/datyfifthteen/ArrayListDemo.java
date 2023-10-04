//program to demonstrate homogeneous list
package com.tns.datyfifthteen;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
	List<Integer> intList = new ArrayList<Integer>();
	System.out.println("Size : "+intList.size());
	intList.add(10);
	intList.add(31);
	intList.add(20);
	intList.add(70);
	intList.add(80);
	
	System.out.println(intList);
	System.out.println("Size : "+intList.size());
	
	intList.add(2, 100);
	System.out.println(intList);
	System.out.println("Size : "+intList.size());
	
	System.out.println("\n Is 50 Present in List: "+intList.contains(50));
	
	System.out.println("\n Index of 20 in List: "+intList.indexOf(20));
	
	intList.remove(0);
	System.out.println("\n"+intList);
	
	intList.remove(intList.indexOf(100));
	System.out.println("\n"+intList);
	
	Iterator<Integer> it= intList.iterator();
	while(it.hasNext())
	{
		int no= it.next();
		System.out.println(no+" is "+(no%2==0?"Even":"Odd"));
	}
	
	System.out.println("\nSort a list in Asscending: ");
	Collections.sort(intList);
	System.out.println(intList);
	
	System.out.println("\ndecending/reverse a List");
	Collections.reverse(intList);
	System.out.println(intList);
	
	
	
	intList.clear();
	System.out.println("Is list Empty: "+intList.isEmpty());
	
	List<String> nameList= new ArrayList<String>();
	nameList.add("Pranav");
	nameList.add("Shubham");
	nameList.add("Rohit");
	nameList.add("Chetan");
	System.out.println(nameList);
	Collections.reverse(nameList);
	System.out.println(nameList);
	}

}
