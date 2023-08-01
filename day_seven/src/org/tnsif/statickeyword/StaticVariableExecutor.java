package org.tnsif.statickeyword;

public class StaticVariableExecutor {
	/*
	 * if any variable is outside the main function and if you want to access 
	 * that variable inside the main function use static keyword
	 */
	static String str = "My name is Shubham";

	public static void main(String[] args) {
		System.out.println(str);

	}

}
