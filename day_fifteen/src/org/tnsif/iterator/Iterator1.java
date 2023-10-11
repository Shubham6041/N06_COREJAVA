package org.tnsif.iterator;

import java.util.ArrayList;
import java.util.Iterator;

// An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. 
// It is called an "iterator" because "iterating" is the technical term for looping.

public class Iterator1 {

	public static void main(String[] args) {
		ArrayList <String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Innova");
		cars.add("Ferrary");
		cars.add("Thar");
		
		// The iterator() method can be used to get an Iterator for any collection:
		Iterator<String> it = cars.iterator();
		System.out.println(it.next());   // print the first item
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
