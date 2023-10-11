package org.tnsif.arraylist;
// Java: Copy one array list into another

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCopy {

	public static void main(String[] args) {
		ArrayList <String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Coconut");
		System.out.println(fruits);
		
		ArrayList<String> letters = new ArrayList<String>();
		letters.add("A");
		letters.add("B");
		letters.add("C");
		letters.add("D");
		
		System.out.println(letters);
		
		System.out.println("*****ArrayLists after copy***** ");
		Collections.copy(fruits, letters);
		System.out.println("Fruits : "+fruits);
		System.out.println("Letters : "+letters);

	}

}
