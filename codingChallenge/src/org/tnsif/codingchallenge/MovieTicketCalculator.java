/*
 * Ask the customer's age and for the time on a 24-hour clock (where noon is 12.00 and 4:30 PM is 16.30).
 * The show timings are 10.15, 13.30, 18.00 and 22.00. The normal adult ticket price is $8.00, however,
 * the adult matinee price is $5.00. Adults are those over 13 years. The normal children's ticket price is $4.00,
 * however, the children's matinee price is $2.00. Write a program that determines the price of a movie ticket
 * Sample Input:
 * 16
 * 10.15
 * Sample Output:
 * $8.00
 */

package org.tnsif.codingchallenge;

import java.util.Scanner;

public class MovieTicketCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter the show time (24-hour clock): ");
        float showTime = scanner.nextFloat();

        float price;
        if (age >= 13) {
            if (showTime <= 13.30) {
                price = 8;
            } else {
                price = 5;
            }
        } else {
            if (showTime <= 13.30) {
                price = 4;
            } else {
                price = 2;
            }
        }

        System.out.println("The price of your ticket is $" + price);
    

	}

}


