package org.tnsif.statickeyword;

/*
 * 1. if any method is declare outside the main function and we want to access that 
 * method inside the main function then we can't use static keyword
 * 
 * 2. we can't use non-static variable inside the static method
 * 
 * 3. if any variable is outside the main function and if you want to access 
 * that variable inside the main function use static keyword
 * 
 * 4. we can't override static method.
 */

public class StaticMethodExecutor {
	
	String str = "Hello";
	static float percentage = 90.80f;
	static void displayScore(int score)
	{
		// System.out.println(str);
		System.out.println(percentage);
		System.out.println("Score is: "+score);
	}

	public static void main(String[] args) {
		displayScore(84);

	}

}
