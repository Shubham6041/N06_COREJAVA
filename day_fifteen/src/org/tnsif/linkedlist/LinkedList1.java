package org.tnsif.linkedlist;
import java.util.LinkedList;

// 1. Java: Insert elements into the linked list at the first and last position
// 2. Java: Get the first and last occurrence of the specified elements in a linked list


public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> Animals = new LinkedList<String>();
		Animals.add("Dog");
		Animals.add("Cow");
		Animals.add("Elephant");
		System.out.println(Animals);
		
		for(String i : Animals)
		{
			System.out.println(i);
		}
		
		Animals.addFirst("Tiger");
		System.out.println(Animals);
		
		Animals.addLast("Lion");
		System.out.println(Animals);
		System.out.println(Animals.getFirst());
		System.out.println(Animals.getLast());
		
		System.out.println(Animals.get(3));
	
	}
	
}
