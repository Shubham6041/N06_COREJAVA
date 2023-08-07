package org.tnsif.abstaction;

public abstract class Sandwich {
	// concrete method
	void showRecipe()
	{
		System.out.println("I don't know how to prepare.");
	}
	
	// abstract method
	abstract void prepare();

}
