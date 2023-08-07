package org.tnsif.abstaction;

public class CheeseCornSandwich extends Sandwich {

	@Override
	void prepare() {
		System.out.println("Cheese Corn Sandwich");
	}
	
	// we can overload or override the method of abstract class.
	void showRecipe(String favFood)
	{
		System.out.println("My favourite food is:  "+favFood);
	}
	
	
}
