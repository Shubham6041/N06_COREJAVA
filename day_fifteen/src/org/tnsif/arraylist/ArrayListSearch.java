package org.tnsif.arraylist;
// Java: Search an element in a array list

import java.util.ArrayList;

public class ArrayListSearch {

	public static void main(String[] args) {
		ArrayList<Double> marks = new ArrayList<Double>();
		marks.add(59.6);
		marks.add(86.32);
		marks.add(42.56);
		
		System.out.println(marks);
		
		if(marks.contains(59.6))
		{
			System.out.println("element Found");
		}
		else
		{
			System.out.println("Element not found");
		}
		
		

	}

}
