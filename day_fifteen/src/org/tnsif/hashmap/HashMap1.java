package org.tnsif.hashmap;

/*
 *  A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type 
 *  (e.g. a String).
 *  One object is used as a key (index) to another object (value). It can store different types: String keys and 
 *  Integer values, or the same type, like: String keys and String values:
 */

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap <String, Integer> person = new HashMap <String, Integer>();
		person.put("Virat", 35);
		person.put("Rohit",36);
		person.put("Shikhar", 34);
		System.out.println(person);
		
		// To access a value in the HashMap, use the get() method and refer to its key:
		System.out.println(person.get("Virat"));
		
		// To remove an item, use the remove() method and refer to the key:
		person.remove("Shikhar");
		System.out.println(person);
		
		// use keySet() method if you only wants keys
		for(String i : person.keySet())
		{
			System.out.println(i);
		}
		
		// use values() method if you wants values
		for(Integer j : person.values())
		{
			System.out.println(j);
		}
		
		// we can print both simultaneously
		for(String k : person.keySet())
		{
			System.out.println("Key : "+k+" Value : "+person.get(k));
		}
	}

}
