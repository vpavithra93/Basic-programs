package com.BasicProgram;

public class Fibnoccii {
	public static void checkfibonocciSeries(int n) {
		int sum=0, t1=0, t2=1,i=0;
		
		while(t1<=n)
		{
			
			System.out.print(t1+" ");
			sum=t1+t2;
			t1=t2;
			t2=sum;
			
		}
		
		
	}
	

	public static void main(String[] args) {
		checkfibonocciSeries(10);

	}

}
