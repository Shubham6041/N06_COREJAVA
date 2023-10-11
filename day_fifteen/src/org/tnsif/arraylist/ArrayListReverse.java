package org.tnsif.arraylist;
// 1. Java: Reverse elements in a array list
// 2. Java: Extract a portion of a array list
// 3. Java: Print all the elements of a ArrayList using the position of the elements


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReverse {

	public static void main(String[] args) {
		ArrayList <String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Coconut");
		System.out.println(fruits);
		
		System.out.println("****After Reversing****");
		Collections.reverse(fruits);
		System.out.println(fruits);
		
		System.out.println("****Sublist of ArrayList****");
		List<String> sublist = fruits.subList(0, 2);
		System.out.println(sublist);
		
		
		int elements = fruits.size();
		for(int i=0; i < elements; i++)
		{
			System.out.println(fruits.get(i));
		}
		

	}

}
