package day15;

import java.util.Scanner;

public class NameChecker {

    public static void main(String[] args) {

        /*  Task 1 :
         * Declare a variable to store your name
         *
         * Check whether your name length is less than 4
         * if so print short Name
         * if it is within 4-11
         * if so print medium Name
         * if it is more than 11
         * print longer name
         * -------------------------
         * check whether your name has either character a or e
         * if so -->> name contains a or e
         * if not -->> i do not have both a or e  in my name
         * ------------------------------------
         *
         * OPTIONAL Print your name in reverse order !
         * */

        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter your name please : ");
        String name = scan.next();

        int lenghtOfTheName = name.length();
        System.out.println("lenghtOfTheName = " + lenghtOfTheName);

        if (lenghtOfTheName < 4) {
            System.out.println("Short Name");
            // } else if (lenghtOfTheName >= 4 && lenghtOfTheName <= 11) {
            // lenghtOfTheName >= 4
        } else if (lenghtOfTheName <= 11) {
            System.out.println("Medium Name");
        }else {
            System.out.println(" Longer Name ");
        }
        // --------------------------------------
                   // true    || true  --->> true
        if ( name.contains("a") || name.contains("e")    ) {
            System.out.println("name contains a or e ");
        }else {
            System.out.println("i do not have either a or e in my name ");
        }






    }
}