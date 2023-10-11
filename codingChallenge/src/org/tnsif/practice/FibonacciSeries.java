package org.tnsif.practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 10;
		int x = 0; 
		int y = 1;
		int z;
		
		System.out.println("the numbers of fibonacci series are: ");
		System.out.println(x);
		for(int i=0; i<n; i++)
		{
			z = x + y;
			System.out.println(z);
			x = y;
			y = z;
			
		}
		
	}

}
