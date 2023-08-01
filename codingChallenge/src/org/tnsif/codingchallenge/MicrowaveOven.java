/*
 * a microwave oven manufacturer recommends that when heating two items at 50% to the heating time, 
 * and when heating 3 items double the heating time.heating more than 3 items at once is not recommended.
 * write a program to find out the recommended heating time.
 * item = 2
 */

package org.tnsif.codingchallenge;

import java.util.Scanner;

public class MicrowaveOven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of items: ");
        int numItems = s.nextInt();

        System.out.println("Enter the heating time for one item: ");
        int heatingTime = s.nextInt();
        
        s.close();

        double recommendedHeatingTime = 0;
        if (numItems == 1) 
        {
            recommendedHeatingTime = heatingTime;
        } 
        else if (numItems == 2) 
        {
            recommendedHeatingTime = heatingTime * 1.5;
        } 
        else if (numItems == 3) 
        {
            recommendedHeatingTime = heatingTime * 2;
        } 
        else 
        {
            System.out.println("WARNING: Heating more than three items at once is not recommended");
        }

        System.out.println("The recommended heating time is " + recommendedHeatingTime + " seconds");
    }
}
