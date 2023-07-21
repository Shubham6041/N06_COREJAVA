package org.tnsif.operator;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		String result = (num % 2 == 0)?"Even" : "Odd";
		System.out.println("Result is: "+result);
		s.close();
		

	}

}
