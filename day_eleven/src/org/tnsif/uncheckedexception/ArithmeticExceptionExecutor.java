/*
 * Exception Handling in java is used to handle runtime errors , so that the normal flow of application can be 
 * preserved.
 * Java Exceptions can arise from different kind of situations such as wrong data entered by the user, hardware 
 * failure , network connection failure or a database server that is down.
 *  
 *  the five keywords are used for exception handling in java :
 *  1. try : the try block is used to define a block of code that may potentially throws an exception.
 *  2. catch : the catch block is used to handle an exception thrown by try block.
 *  3. finally : the finally block is used to execute code regardless of whether an exception is thrown or not.
 *  4. throw : the throw keyword is used to throw an exception.
 *  5. throws : the throws keyword is used to specify that the method may throw an exception.
 */

package org.tnsif.uncheckedexception;

import java.util.Scanner;

public class ArithmeticExceptionExecutor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		try {
			System.out.println(a/b);
		}
		catch(Exception e){
			System.out.println("Arithmetic Exception handled"+e);
		}
	}

}
