package org.tnsif.arraylist;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList <String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		System.out.println(fruits);
		fruits.add(0, "Papaya");
		
		// we can print arrayList by using loop
		for(String i : fruits)
		{
			System.out.println(i);
		}
		
		System.out.println(fruits.size());
		
		// to access an element in the arrayList use get() method.
		System.out.println(fruits.get(0));
		
		// to modify an element use the set() method
		fruits.set(1, "Coconut");
		System.out.println(fruits);
		
		System.out.println(fruits.isEmpty());		
		
		// to remove an element use the remove() method
		fruits.remove(2);
		System.out.println(fruits);
		
		System.out.println(fruits.size());
		
		// to remove all the elements use the clear() method
		fruits.clear();
		//fruits.removeAll(fruits);
		System.out.println(fruits);
		
		// Java: Test an array list is empty or not
		System.out.println(fruits.isEmpty());		
		
	}

}
