package com.BasicProgram;

public class StringPalindrome {
	public static void checkstringPalindrome(String s) {
		String rev="";
		
		int n=s.length();
		
		for(int i=n-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
			
		}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println(s+" is a palindrome");
		}else
		{
			System.out.println(s+" is not a palindrome");
		}
		
		
	}

	
	public static void main(String[] args) {
		checkstringPalindrome("Madan");
		

	}

}
