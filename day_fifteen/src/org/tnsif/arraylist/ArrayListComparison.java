package org.tnsif.arraylist;
// Java: Compare two array lists

import java.util.ArrayList;

public class ArrayListComparison {

	public static void main(String[] args) {
		ArrayList <String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Coconut");
		System.out.println(fruits);
		
		ArrayList <String> f1 = new ArrayList<String>();
		f1.add("Apple");
		f1.add("Banana");
		f1.add("Mango");
		f1.add("Coconut");
		System.out.println(f1);
		
		ArrayList <String> compare = new ArrayList <String>();
		
		for(String i : fruits)
		{
			compare.add(f1.contains(i) ? "Yes" : "No");
		}
		System.out.println(compare);

	}

}
