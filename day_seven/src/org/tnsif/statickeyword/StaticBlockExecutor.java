/*
 * 1. static block is used to initialize the static variable
 * 2. we can't initialize any non-static variable inside the static block
 */

package org.tnsif.statickeyword;

public class StaticBlockExecutor {
	
	String str;
	static int age;
	
	static {
		age = 21;
		// str = "xyz";
		System.out.println(age);
	}
	
	/*static void show()
	{
		System.out.println(age);
	}
	*/
	public static void main(String[] args) {
		// show();
		/*
		 * main function is static and hence it called static method by default
		 */

	}

}
