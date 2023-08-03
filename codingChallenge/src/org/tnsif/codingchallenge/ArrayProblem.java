/*
 * Shahid is a computer science student and his teacher gave him a simple question to solve within time but he is 
 * little busy in his life, so he asked you to solve this problem.
 * Problem statement : You have been given an array of positive integers A1,A2,...,An with legnth N and you have 
 * to print an array of same legnth(N) where the values in the new array are the sum of every number in the array, 
 * except the number at that index.
 * Input:
 * The first line of input contains a single integer T denoting the number of test cases.
 * Each test cases contain two lines.First line contains N, the length of the array and 
 * second line contains N space separated positive integers.
 * Output:
 * For each test case, output a single array of same length.
 * Constraints:
 * 1 ≤ T ≤ 100
 * 1 ≤ N ≤105
 * 0 <= A[i] <= 109
 */

package org.tnsif.codingchallenge;

import java.util.Scanner;

public class ArrayProblem 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of test cases: ");
        int t = s.nextInt();

        for (int i = 0; i < t; i++) 
        {
        	System.out.println("Enter the length of the array: ");
            int n = s.nextInt();

            int[] arr = new int[n];
            for (int j = 0; j < n; j++) 
            {
                arr[j] = s.nextInt();
            }

            int[] sum = new int[n];
            for (int j = 0; j < n; j++) 
            {
                int sumOfAllExceptJ = 0;
                for (int k = 0; k < n; k++) 
                {
                    if (k != j) 
                    {
                        sumOfAllExceptJ += arr[k];
                    }
                }
                sum[j] = sumOfAllExceptJ;
            }

            for (int j = 0; j < n; j++) 
            {
                System.out.print(sum[j] + " ");
            }
            System.out.println();
        }

	}
}

