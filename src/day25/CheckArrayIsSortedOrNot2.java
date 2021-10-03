package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot2 {

    public static void main(String[] args) {

        // int[] bums = {13, 31, 8, 5, 21, 2} ;
         int[] bums = {1, 2, 3, 4, 5, 6} ;
        System.out.println("bums = " + Arrays.toString(bums) ) ;

        // CREATE A VARIABLE CALLED isSortedAlready AND ASSIGN VALUE OF TRUE ;
        // I ASSUME THE ARRAY IS ALREADY SORTED
        // AND IF IT'S NOT THEN I CHANGE THE VALUE OF isSortedAlready to FALSE
        Boolean isSortedAlready = true;
        for (int x = 0; x < bums.length-1 ; x++) {

           // System.out.println( bums[x] + " " + bums[x+1] ) ;
            // pick first item and compare with second item
            // keep repeating until there is no more item

            // print is item1 is less than item 2

        System.out.println(" is " + bums[x] + " less than " + bums[x+1] + " ? " + (bums[x]<bums[x+1]) ) ;
      if ( !(bums[x] < bums[x+1] ) ) {

          System.out.println("ARRAY IS NOT SORTED , NO POINT CHECKING THE REST ") ;
          isSortedAlready = false ;
          break ;
      }
        }
        System.out.println("isSortedAlready = " + isSortedAlready);




    }
}
