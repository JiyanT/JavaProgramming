package day17;

import java.util.Scanner;

public class ReversePrintString {

    public static void main(String[] args) {

        // get your name printed in reversed order
        // assuming you don't know the length

        // find out the location of your last character of your name
        // pick your last character of your name
        // then keep shifting the location to pick until first character

        //String name = "Jiyan" ;

        Scanner scan = new Scanner(System.in) ;
        System.out.println("ENTER YOUR NAME");

        String name = scan.nextLine() ;

       //  int lastCharacterIndex = name.length() -1 ;
        int x = name.length() - 1 ;

        while (x>=0) {
            System.out.println( " index " + x + " : " + name.charAt(x) ) ;
            --x ;
        }

    }
}
