package day08;

import java.util.Scanner;

public class JustIfStatement {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in) ;

        System.out.println("What is current speed , dear driver: ");

        int currentLimit= scan.nextInt() ;

        System.out.println(" What is speed limit ");
           int speedlimit = scan.nextInt();

           if( currentLimit >= speedlimit ) {
               System.out.println("get pulled over by the police");
               System.out.println("given ticket by the police");
               System.out.println( "taken away some points on your licence");
               System.out.println("go to court");

           } // THERE IS NO ELSE , PROGRAM JUST MOVE ON

        System.out.println(" THE END OF THE STORY !!!! MOVE ON !!!! ");





    }
}
