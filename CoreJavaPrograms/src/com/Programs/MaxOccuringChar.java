package com.Programs;

public class MaxOccuringChar {

		static final int n = 256;
		static char MaxOccuringChar1(String str)
		{
			int char1[] = new int[n];
			int l = str.length();
			
			for(int i = 0; i < l; i++)
			{
				char1[str.charAt(i)]++;
				int max = -1;
				char result = ' ';
				
			for(int j = 0; j < l; i++)
			{
				if(max < char1[str.charAt(j)])
				{
					max = char1[str.charAt(j)];
					result = str.charAt(j);
					
				}
			}
			return result;
			}
		}

			public static void main(String[] args) {
				
			String str = "Java";
			System.out.println("The input String is : "+str);
			System.out.println("Maximum Occurance of the above String : " +MaxOccuringChar1(str));
				
			}
		}
}




