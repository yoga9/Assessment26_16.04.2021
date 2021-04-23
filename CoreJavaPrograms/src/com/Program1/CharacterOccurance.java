package com.Program1;

public class CharacterOccurance {
	
 public static void main(String[] args) {
	 
	System.out.println("Count the Occurance of Character in String");
	
	String str = "This is Core Java Learing by Yogeshwari Karnan";
	
	//1) CharArray -- for Loop
	//2)str.len = charAt(i)
	//Streams
	
	int count = 0;
	for(char ch : str.toCharArray()) {
		
		if((ch == ' '))
		{
			count++;
		}
	}
	System.out.println(count);
	
	getCharOccurance(str,'i');
	getCharCount(str,'b');
	getCharOccuranceStream(str,"L");
	
	
	long count1 = str.chars().mapToObj(e -> String.valueOf((char)e)).filter(e -> e.equals("Y")).count();
	System.out.println("Count the Character by Using Stream : " +count1);
	
}
 
 public static void getCharCount(String str,char val) {
	 System.out.println("Count the Occurance of Character in String by Using Method1");
		int count = 0;
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i) == val)
			{
				count++;
		}
		}
			System.out.println(val + ":" +count);
	}
		
 
 	public static void getCharOccurance(String str, char val) {
 		System.out.println("Count the Occurance of Character in String by Using Method");
 		int count = 0;
 		for(char ch : str.toCharArray()) {
 			
 			if((ch == val))
 			{
 				count++;
 			}
 		}
 		System.out.println(val + ":" +count);
 		
 	}
		
	


 	public static void getCharOccuranceStream(String str, String val)	{
 		
 		long count1 = str.chars().mapToObj(e -> String.valueOf((char)e)).filter(e -> e.equals(val)).count();
 		System.out.println("Count the Character by Using Stream in method : " +count1);
 		
 		}
 		
 	
 	
 	
}
 	