package org.tnsif.linkedlist;

import java.util.LinkedList;

public class LinkedListJoin {

	public static void main(String[] args) {
		LinkedList <String> animals = new LinkedList<String>();
		animals.add("Dog");
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Elephant");
		System.out.println("Linked List 1 : "+animals);
		
		LinkedList<String> birds = new LinkedList<String>();
		birds.add("Duck");
		birds.add("Parrot");
		System.out.println("Linked List 2 : "+birds);
		
		LinkedList<String> c = new LinkedList<String>();
		c.addAll(animals);
		c.addAll(birds);
		
		System.out.println(c);

	}

}
