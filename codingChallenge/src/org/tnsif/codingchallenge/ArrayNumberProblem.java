package org.tnsif.codingchallenge;

import java.util.Scanner;

public class ArrayNumberProblem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = s.nextInt();
        }

        int[] mult = new int[n];
        for (int i = 0; i < n; i++) 
        {
            int multOfAllExceptI = 1;
            for (int j = 0; j < n; j++) 
            {
                if (j != i) 
                {
                    multOfAllExceptI = multOfAllExceptI * arr[j];
                }
            }
            mult[i] = multOfAllExceptI;
        }

        for (int i = 0; i < n; i++) 
        {
            System.out.print(mult[i] + " ");
        }
        System.out.println();

	}

}
