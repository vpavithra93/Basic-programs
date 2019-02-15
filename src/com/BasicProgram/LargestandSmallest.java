package com.BasicProgram;

public class LargestandSmallest {

	public static void main(String[] args) {
		int n[]= {12,-10,5,6,87689};
		int largest=n[0];
		int smallest=n[0];
		for(int i=1;i<n.length;i++) {
			if(n[i]>largest) {
				largest=n[i];			
			}
			else if(n[i]< smallest) {
				smallest=n[i];
			}
		}
		System.out.println("largest num is"+largest);
		System.out.println("smallest num is"+smallest);
	}

}
