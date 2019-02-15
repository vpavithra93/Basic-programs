package com.BasicProgram;

public class Trianglestar {
	public static void checktriaglestar(int n) {
	
		
		/**
*****
*****
*****
*****
*****
		 	for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) {
				
				System.out.print("*");	
			}
			System.out.println();
		}**/ 
/**
*
**
***
****
*****  
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}**/
/**
		
		 *
	    **
	   ***
	  ****
	 *****  **/
	
	
		/**for (int i = 1; i <= n; i++)
        {
            for (int j = n; j >= i; j--)
            {
                System.out.print(" ");
                
                }
            for(int k=1;k<=i;k++) {
            	System.out.print("*");
            }
            System.out.println("");
        }**/
		/** for (int i = 0; i < n; i++) {

            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println("");
        }**/
		
		/**for(int i=0;i<n;i++) {
			for(int j=0;j>i;j++) {
				System.out.print(" ");
			}
			for(int k=n;k>i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}**/
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int k=n;k>i;k--){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num=num+1;
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		checktriaglestar(5);
	

	}

}
