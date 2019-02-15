package com.BasicProgram;

public class PrimeNum {
	public static  boolean checkprime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2; i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		}
	
	public static void getprimenum(int m) {
		for(int i=2; i<=m; i++) {
			if(checkprime(i)==true) {
				System.out.println(i+" ");
			}
		}
	}

	public static void main(String[] args) {
	checkprime(2);
	checkprime(9);
	//System.out.println(n+"is prime number"+ checkprime(n));
	//System.out.println("9 is prime number"+ checkprime(9));
	
	getprimenum(20);
	}

}
