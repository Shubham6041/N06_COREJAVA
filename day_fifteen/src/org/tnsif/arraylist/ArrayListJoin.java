package org.tnsif.arraylist;
// 1. Java: Join two array lists
//2. Java: Clone an array list to another array list

import java.util.ArrayList;
import java.util.List;

public class ArrayListJoin {

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
		
		ArrayList <String> j = new ArrayList<String>();
		j.addAll(fruits);
		j.addAll(letters);
		System.out.println(j);
		
		/*
		ArrayList <String> f2 = (ArrayList<String>)fruits.clone();
		System.out.println(f2);
		*/
	}

}
