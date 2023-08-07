package org.tnsif.abstaction;

public class AbstractionExecutor {

	public static void main(String[] args) {
		/*
		 * Sandwich s = new Sandwich();
		 * we can't create the object of abstract class
		 */
		CheeseCornSandwich c = new CheeseCornSandwich();
		c.prepare();
		c.showRecipe();
		c.showRecipe("GulabJamun");
	}

}
