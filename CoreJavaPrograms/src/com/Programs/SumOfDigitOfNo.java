package com.Programs;

import java.util.Scanner;

public class SumOfDigitOfNo {

	public static void main(String[] args) {
		
		int n, next, sum = 0;
		
		System.out.println("Enter the Number : ");
		Scanner s = new Scanner(System.in);
	    next = s.nextInt();
	    
		while(next > 0)
		{
			n = next % 10;
			sum = sum + n;
			next = next / 10;
		}
		System.out.println("Sum of the digits : "+sum);
	}

}
