//program to demonstrate on User-input value
package org.tnsif.introduction;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		//String str1 = s.next();
		String str1 = s.nextLine();
		System.out.println("String is: "+str1);
	}

}
