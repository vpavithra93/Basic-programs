package com.BasicProgram;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String name1[]= {"java", "python", "c", "c++", "java"};
		
		Set<String> store= new HashSet<String>();
		for(String name11 : name1) {
			if(store.add(name11 )==false) {
				System.out.println(name11 );
			}
		}
		
		
		
		
	

	}

}
