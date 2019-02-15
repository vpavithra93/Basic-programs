package com.BasicProgram;

public class StringManipulation {

	public static void main(String[] args) {
		String str="the rain have started here seleniums";
		String str1="the Rain have started here seleniums";
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s',str.indexOf("s")+1));
		System.out.println(str.indexOf('s',str.indexOf('s' ,str.indexOf('s')+1)+1));
		System.out.println(str.indexOf("have"));
		System.out.println(str.indexOf("hello"));
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.substring(0,  8));
   
		String s="  hello world ";
		System.out.println(s.trim());
		System.out.println(s.replaceAll(" ", ""));
		
	String s1= "Hello_world_java_training";
	String s2[]=s1.split("_");
	for(int i=0;i<s2.length;i++) {
	System.out.println(s2[i]);
	}
	}

	}


