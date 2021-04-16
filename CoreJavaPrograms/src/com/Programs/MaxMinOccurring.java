package com.Programs;

public class MaxMinOccurring {

	public static void main(String[] args) {
		
		String s = "Sara";
		
		int[] f = new int[s.length()];
		char minChar = s.charAt(0), maxChar = s.charAt(0);
		int i,j,min,max;
		
		char str[] = s.toCharArray();
		
		for(i = 0; i < str.length; i++)
		{
			f[i] = 1;
			 for(j = i+1; j < str.length; j++)
			 {
				 if(str[i] == str[j] && str[i] != ' ' && str[i] != '0')
				 {
					 f[i]++;
					 str[j] = '0';
				 }
			 }
		}
		min = max = f[0];
		for(i = 0; i < f.length; i++)
		{
			if(min > f[i] && f[i] != '0')
			{
				min = f[i];
				minChar = str[i];
			}
			
			if(max < f[i]);
			{
				max = f[i];
				maxChar = str[i];
		}
		
	}
		System.out.println("Maximum Occurring character in the above String : " +maxChar);
		System.out.println("Minimum Occurring character in the above String : " +minChar);
	}

}
