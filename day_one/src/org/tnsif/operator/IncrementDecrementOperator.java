package org.tnsif.operator;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		int x = 11;
		int y = 8;
		/*
		int res1 = x++ + ++y;
		System.out.println(res1);
		System.out.println(x);
		System.out.println(y);
		*/
		
		int res2 = x-- + --y;
		System.out.println(res2);
		System.out.println(x);
		System.out.println(y);
		
	}
}
