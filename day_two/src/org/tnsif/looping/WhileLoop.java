package org.tnsif.looping;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		
		while(num >= 1)
		{
			System.out.println(num);
			num--;
		}
	}
	

}
