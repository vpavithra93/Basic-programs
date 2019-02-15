package com.practice;

public class Pyramid {
	public static void checkleftsidepyramid(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=2*(n-i);j<i;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
		}
		
	}

	public static void main(String[] args) {
		checkleftsidepyramid(5);

	}

}
