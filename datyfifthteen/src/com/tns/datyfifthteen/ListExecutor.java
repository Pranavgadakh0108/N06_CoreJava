//program to demonstrate heterogeneous list
package com.tns.datyfifthteen;

import java.util.*;

public class ListExecutor {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List listOne= new ArrayList();
		listOne.add(10);
		listOne.add("Hi");
		listOne.add(10.202f);
		listOne.add(true);
		listOne.add(new Date());
		
		System.out.println(listOne);
		
		
	}

}
