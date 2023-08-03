package org.tnsif.finalkeyword;

// public final class Laptop{ ----> final class cannot be inherit
public class Laptop {
	final String PROCESSOR = "Ryzen 5";
	
	final void display()
	{
		System.out.println(PROCESSOR);
	}
}
