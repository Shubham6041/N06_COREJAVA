package org.tnsif.looping;

import java.util.Scanner;

public class ForLoopHw2 {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner s = new Scanner(System.in);
		int rows = s.nextInt();
		for(int i=1; i<=rows; i++)
		{
			for(int j = rows; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
