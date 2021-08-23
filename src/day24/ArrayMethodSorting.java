package day24;

import java.util.Arrays;   // DO NOT CALL YOUR OWN CLASS Arrays

public class ArrayMethodSorting {

    public static void main(String[] args) {

        int[] scores = {99,44,66,23,19,55} ;

        System.out.println(Arrays.toString(scores) ) ;

        // for sorting an array in ascending order-- low to high
        // sort ---->>> Arrays.sort(yourArrayHere)

        Arrays.sort(scores) ;
        System.out.println(Arrays.toString(scores) ) ;







    }
}
