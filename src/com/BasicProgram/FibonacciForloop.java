package com.BasicProgram;

public class FibonacciForloop {
	public static void checkfibonacci(int n)
	{
		int i,t1=0,t2=1,sum;
		if(t1==0||t2==1)
		{
			System.out.print(t1+" "+t2+" ");
		}
		for(i=2;i<n;i++){
			sum=t1+t2;
			System.out.print(sum+" ");
			t1=t2;
			t2=sum;
			
		}
	}

	public static void main(String[] args) {
		checkfibonacci(15);

	}

}
