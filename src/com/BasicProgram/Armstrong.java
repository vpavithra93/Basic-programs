package com.BasicProgram;

public class Armstrong {
	public static void checkArmstrong(int n) {
		int cube=0;
		int r;
		int t;
		t=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			cube=cube+(r*r*r);
		}
		if(t==cube) {
			System.out.println(t+"is Armstrong num");
		}
		else {
			System.out.println(t+"is not a Armstrong num");
		}
		
	}

	public static void main(String[] args) {
		checkArmstrong(15);

	}

}
