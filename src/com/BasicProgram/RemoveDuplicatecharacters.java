package com.BasicProgram;

public class RemoveDuplicatecharacters {
	public static void removeduplicatecharacters() {
		String s="Pavithrap";
		String temp=" ";
		char[] str=s.toCharArray();
		int n=str.length;
		for(int i=0;i<(n-1);i++) {
			for(int j=i+1;j<(n-1);j++) {
				if(str[i]==str[j]) 
			       break;	
					
		}
			
		}
		System.out.println(temp);
	
	}


	public static void main(String[] args) {
		removeduplicatecharacters();

	}

	}

