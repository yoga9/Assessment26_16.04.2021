package com.Programs;

import java.util.Scanner;

public class FrequencyofCharacter {

	public static void main(String[] args) {
		
		System.out.println("Enter the String : ");
		Scanner obj = new Scanner(System.in);
		String s = obj.nextLine();
		
		System.out.println("Enter the particular character in the above string : ");
		char c = obj.nextLine().charAt(0);
		int count = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			if(c == s.charAt(i))
			{
				count++;
			}
		}
		
		System.out.println("Frequency of the given character : " +count);
	}

}
