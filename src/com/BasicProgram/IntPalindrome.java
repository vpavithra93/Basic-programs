package com.BasicProgram;

public class IntPalindrome {
	public static  void checkpalindrome(int n)
	{
	int  rem, sum=0, temp=n;
	while(n>0) {
		rem=n%10;
		sum=sum*10+rem;
		n=n/10;
		
	}
	if(sum==temp) {
	System.out.print(temp+" is palindrome");
	}else
	{
		System.out.print(temp+" is not a palindrome");
	}
	}

	public static void main(String[] args) {
		checkpalindrome(1221);
		
		

	}

}
