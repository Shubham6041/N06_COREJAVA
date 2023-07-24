package org.tnsif.operator;

import java.util.Scanner;

public class ArithmeticOperatorDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the  number: ");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		System .out.println("the sum is: "+ (num1+num2));
		System.out.println("the substraction is: "+ (num1-num2));
		System.out.println("multiplication: "+ num1*num2);
		System.out.println("Division: "+ num1/num2);		
		

	}

}
