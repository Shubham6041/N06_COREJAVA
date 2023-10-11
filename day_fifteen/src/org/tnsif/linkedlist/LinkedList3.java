package org.tnsif.linkedlist;

import java.util.LinkedList;
// Java: Insert some elements at the specified position into a linked list


public class LinkedList3 {

	public static void main(String[] args) {
		LinkedList <String> animals = new LinkedList<String>();
		animals.add("Dog");
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Elephant");
		
		System.out.println(animals);
		
		LinkedList<String> birds = new LinkedList<String>();
		birds.add("Duck");
		birds.add("Parrot");
		
		animals.addAll(0, birds);
		System.out.println(animals);
		
		for(String i: animals)
		{
			System.out.println(i);
		}
		
	}

}
