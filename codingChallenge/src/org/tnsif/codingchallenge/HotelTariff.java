/*
 * write a program to calculate the hotel tariff. the room rent is 20% high during peak season ( apr-jun and nov-dec).
   month = 3, rent = 1500, days = 2
 */

package org.tnsif.codingchallenge;

import java.util.Scanner;

public class HotelTariff {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = s.nextInt();

        System.out.print("Enter the room rent per day: ");
        double rent = s.nextDouble();

        System.out.print("Enter the number of days: ");
        int days = s.nextInt();

        double totalCost = calculateTariff(month, rent, days);
        System.out.println("The hotel tariff for " + days + " days is: Rs" + totalCost);

        s.close();
    }

    public static double calculateTariff(int month, double rent, int days) {
        // Define the months for peak season (April to June and November to December)
        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                rent = rent + (rent * 0.2); // 20% increase for peak season
                break;
            default:
                break;
        }

        double totalCost = rent * days;
        return totalCost;
    }

}


