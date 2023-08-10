package org.tnsif.singledimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

/*
 * program to demonstrate the array using runtime input values and to find largest element in an array
 */
public class ArrayMax {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total number of array elements: ");
		int n = s.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i] = s.nextInt();
		}
		
		System.out.println("Array elements are: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		int max = arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("Largest element is: "+max);
		
		Arrays.sort(arr);     // ---> used to sort the array elements
		System.out.println("Array elements after sorting: ");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
		
	}

}
