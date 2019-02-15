package com.BasicProgram;

public class Factorial {
public static int checkfactorial(int n){
	int fact=1;
	for(int i=1;i<=n;i++) {
		fact=fact*i;
	}
	return fact;
}
public static int recursive(int n) {
	if(n==0)
		return 1;
	else
		return (n*recursive(n-1));
}
	public static void main(String[] args) {
		//System.out.println(checkfactorial(1));
		System.out.println(recursive(4));
	}
		

	}


