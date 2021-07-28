package day07;

import java.util.Scanner;

public class ReplTask_20_Time {

    public static void main(String[] args) {
        //1. WRITE YOUR CODE HERE:
        int hour, minute, second ;
        String  am0rPm ;

        //DO NOT TOUCH BELOW LINES.TEACHER WILL SET VALUES
        Scanner sc= new Scanner(System.in) ;
        hour      = sc.nextInt() ;
        minute    = sc.nextInt() ;
        second    = sc.nextInt() ;
        am0rPm    = sc.next() ;
        //##############################

        //2. WRITE YOUR CODE HERE:
        System.out.println( hour + ":" + minute + ":" + second + " " + am0rPm );



    }
}
