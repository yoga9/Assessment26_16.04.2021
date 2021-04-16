package com.Programs;

import java.util.Scanner;

public class SumOfEvenNo_OddNo {

	public static void main(String[] args) {
		
		int i, n;
		int oddSum = 0, evenSum = 0;
		
		System.out.println("Enter the Number : ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for(i = 1; i <= n; i++)
		{
			if(i % 2 == 0)
			{
				evenSum = evenSum + i;
			}
			else
			{
				oddSum = oddSum + i;
			}
		}
		System.out.println("Sum of all Even no : "+evenSum);
		System.out.println("Sum of all Odd no : "+oddSum);
		
	}

}
