/*
 * Mileage Calculator 
 * 
 * This program calculates the user's miles per 
 * gallon after the user inputs the european kilometers driven and liters of 
 * fuel consumed. This is useful for American tourists. 
 */

/**
 * @version Java Assn 2, version 1.0
 * @author jeannaclark
 */

import java.util.Scanner;

public class ClarkMileageCalculator {
    public static void main (String[] args) {
        // explain program to user
        System.out.print("This program will calulate your automobile's mileage "
                + "in miles per gallon. \nIt will request your kilometers " 
                + "traveled and liters of gas consumed.\n");
        
        // initialize variables
        int kilometers = 0;
        int liters = 0;
        double gallons = 0.0;
        double miles = 0.0;
        double mileage = 0.0;

        // collect user inputs
        System.out.print("\nWhat is your total kilometers driven? ");
        Scanner keyboard = new Scanner(System.in);
        kilometers = keyboard.nextInt();
        System.out.print("\nWhat is the number of liters of gas purchased? ");
        liters = keyboard.nextInt();
        
        // convert foreign metrics to US customary measures
        gallons = liters * 0.264172;
        miles = kilometers * 0.621371;
        
        // calculate mileage in miles per gallon
        mileage = miles / gallons;

        // display results to user
        System.out.printf("\n\n\n\n" + "Your total kilometers driven were: " + 
                kilometers);
        System.out.printf("\nYour total miles driven are: %.1f", miles);
        System.out.printf("\nYour total liters of gas purchased was: " 
                + liters);
        System.out.printf("\nYour total gallons of gas purchased was: %.1f",
                 gallons);
        System.out.printf("\nYour mileage is: %.2f", mileage);
        System.out.printf(" miles per gallon" + "\n\n");
    }
}
