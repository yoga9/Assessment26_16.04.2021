package com.Programs;

import java.util.Scanner;

public class RemoveOccuranceOfString {
	
	private static Scanner s;
	
	public static void main(String[] args) {
		
		String removeChar;
		char delChar;
		
		s = new Scanner(System.in);
		
		System.out.println("Enter the String to remove the Occurance of the Character: ");
		removeChar = s.nextLine();
		
		System.out.println("Enter the Occurance Character to remove: ");
		delChar = s.next().charAt(0);
		
		String str = removeChar.replace(delChar, Character.MIN_VALUE);
		
		System.out.println("The String after removal of Occurance character : "+str);
		
		
		
	}

}
