/*
 * ask a user for their birth year encoded as two digits(like "02") and for the current year 
 * also encoded as two digits("23") write a program to find users current age in years.
 */

package org.tnsif.codingchallenge;

import java.util.Scanner;

public class AgeCalculatorExecutor {
	
	static int age;
	
	static void ageCalculator(int by, int cy)
	{
		if(cy > by)
		{
			 age = cy - by;
			 System.out.println("the age is: "+age);
		}
		else
		{
			age = (100 - by) + cy;
			System.out.println("the age is: "+age);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the birth year and current year: ");
		int by = s.nextInt();
		int cy = s.nextInt();
		
		ageCalculator(by, cy);

	}

}
