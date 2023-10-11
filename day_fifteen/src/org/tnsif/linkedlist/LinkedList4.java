package org.tnsif.linkedlist;
// Write a Java program to display elements and their positions in a linked list.
// Write a Java program to remove the first and last elements from a linked list.
// Write a Java program that swaps two elements in a linked list.
// Write a Java program to shuffle elements in a linked list.

import java.util.Collections;
import java.util.LinkedList;
public class LinkedList4 {

	public static void main(String[] args) {
		LinkedList<String> Animals = new LinkedList<String>();
		Animals.add("Dog");
		Animals.add("Cow");
		Animals.add("Elephant");
		System.out.println(Animals);
		
		for(int i=0; i < Animals.size();i++)
		{
			System.out.println(i+" : "+Animals.get(i));
		}
		
		Collections.swap(Animals, 0, 2);
		System.out.println(Animals);
		
		Collections.shuffle(Animals);
		System.out.println(Animals);
		
		Animals.removeFirst();
		Animals.removeLast();
		
		System.out.println(Animals);
	}

}
