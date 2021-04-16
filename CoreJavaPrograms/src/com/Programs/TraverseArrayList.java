package com.Programs;

import java.util.ArrayList;
import java.util.Iterator;

public class TraverseArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Sara");
		names.add("Moni");
		names.add("Sugan");
		names.add("Anu");
		names.add("Nisha");
		
		System.out.println("TraverseArrayList by Using foreach loop");
		
		for(String s : names)
		{
			System.out.println(s);
		}
		
		System.out.println("-----");

		System.out.println("TraverseArrayList by Using foreach loop by using Lambda");
		
		names.forEach(n -> System.out.println(n));
		
		System.out.println("-----");
		
		System.out.println("TraverseArrayList by Using Iterator");
		
		Iterator<String> i = names.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
