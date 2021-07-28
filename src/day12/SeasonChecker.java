package day12;

import java.util.Scanner;

public class SeasonChecker {
    /* Task 5:
     * Create a String variable season
     * Assign value by asking user question : Enter your season Please !!
     * Check the season using if statement without caring about the case
     * If Spring --> Hiking, Newroz, Allergy Season, cool weather
     * If Summer --> Pool, Swimming , Beach , Vacation
     * If Fall --->  barbecue , riding bike, JUST CODE!! , Halloween
     * If Winter --> Code!! , Ski, sledding , snowman
     */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your season please");

        String season = scan.next();

        if (season.equalsIgnoreCase("spring")) {
            System.out.println("Hiking, Newroz, Allergy Season, cool weather");
        } else if (season.equalsIgnoreCase("summer")) {
            System.out.println("Pool, Swimming , Beach , Vacation");
        } else if (season.equalsIgnoreCase("fall")) {
            System.out.println("barbecue , riding bike, JUST CODE!! , Halloween");
        } else if (season.equalsIgnoreCase("winter")) {
            System.out.println("If Winter --> Code!! , Ski, sledding , snowman");
        } else {
            System.out.println("NOT VALID!!!");
        }
    }
}