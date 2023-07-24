package org.tnsif.decisionmaking;

import java.util.Scanner;

public class CascadedIfElse {

	public static void main(String[] args) {
		System.out.println("Enter the age : ");
		Scanner s = new Scanner(System.in);
		int age1 = s.nextInt();
		int age2 = s.nextInt();
		int age3 = s.nextInt();
		
		if(age1 > age2 && age1 > age3)
		{
			System.out.println("Age1 is greater: "+ age1);
		}
		else if(age2 > age1 && age2 > age3)
		{
			System.out.println("Age2 is greater: "+ age2);
		}
		else
		{
			System.out.println("Age3 is greater: "+ age3);
		}

	}

}
