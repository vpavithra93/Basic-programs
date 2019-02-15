package com.BasicProgram;

public class RemoveJunk {

	public static void main(String[] args) {
		String s="uytrrj784567!$@%#^%^&*^*6476";
		
s=s.replaceAll("[^a-zA-Z0-9]", "");
System.out.println(s);
		

	}

}
