package com.Programs;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

		public static void main(String[] args) {
			
			ArrayList<String> names = new ArrayList<String>();
			
			names.add("Sara");
			names.add("Moni");
			names.add("Sugan");
			names.add("Anu");
			names.add("Nisha");
			
			System.out.println("Before Reversing");
			names.forEach(n -> System.out.println(n));
			
			System.out.println("----");
			
			Collections.reverse(names);
			System.out.println("After Reversing");
			names.forEach(n -> System.out.println(n));
			
		}
}
