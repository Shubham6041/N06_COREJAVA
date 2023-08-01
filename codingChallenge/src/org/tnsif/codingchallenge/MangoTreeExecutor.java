/*
 * darshan is so much excited in gardening and hence he plants more trees in his garden. he plants trees
 * in a rectangular fashion with the order of rows and coloumns. and numbers the trees in row wise order. 
 * he planted the mango tree in the first row , first coloumn and last coloumn. so given the tree number(t) and 
 * row and coloumn(n) number as input, your task is to find out whether the given tree is a mango tree or not.
 */

package org.tnsif.codingchallenge;

import java.util.Scanner;

public class MangoTreeExecutor {
	static void isMangoTree(int n, int t)
	{
		if(t%n == 0 || t%n == 1 || t<=n)
		{
			System.out.println("Mango Tree");
		}
		else
		{
			System.out.println("Not Mango Tree");
		}
	}
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int t = s.nextInt();
		isMangoTree(n, t);
	}

}


