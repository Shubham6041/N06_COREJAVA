package org.tnsif.arraylist;
// 1. Java: Sort a given array list
// 2. Java: Shuffle elements in a array list
// 3. Java: Swap two elements in an array list

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList <String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Coconut");
		System.out.println(fruits);
		
		System.out.println("****After Sorting****");
		Collections.sort(fruits);
		System.out.println(fruits);
		
		System.out.println("****After Shuffling****");
		Collections.shuffle(fruits);
		System.out.println(fruits);
		
		System.out.println("****After Swapping****");
		Collections.swap(fruits, 2, 3);
		System.out.println(fruits);

	}

}
