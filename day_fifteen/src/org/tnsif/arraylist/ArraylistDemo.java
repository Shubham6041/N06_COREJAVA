// program to demonstrate homogeneous array list.
/*
 * The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified 
 * (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be 
 * added and removed from an ArrayList whenever you want
 */
package org.tnsif.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(5);
		lst.add(10);
		lst.add(15);
		lst.add(20);
		lst.add(25);
		System.out.println(lst);
		System.out.println("Size of the array list : "+lst.size());
		
		Collections.sort(lst);
		System.out.println("After Sorting");
		System.out.println(lst);
		
		Collections.reverse(lst);
		System.out.println("After Reversing");
		System.out.println(lst);
		
		
		

	}

}
