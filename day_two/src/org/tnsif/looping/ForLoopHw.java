package org.tnsif.looping;

import java.util.Scanner;

public class ForLoopHw {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
