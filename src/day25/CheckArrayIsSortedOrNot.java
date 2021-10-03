package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {

    public static void main(String[] args) {

      //  int[] numbs = {13, 31, 8, 5, 21, 2} ;
        int[] numbs = {1, 2, 3, 4, 5, 6} ;

        System.out.println("numbs = " + Arrays.toString(numbs));

        // storing the size of an array into a variable
        int numbsItemCount = numbs.length ;

        // I want to copy the content of numbs array into the new array

        //        creating an array with same size as original array
        int[] numbsCopy = new int[numbsItemCount] ;

        // copying the value of one array into the new array
        for (int x = 0; x < numbsItemCount ; x++) {
        numbsCopy[x] = numbs[x] ; // this line is copying numbs array items into numbsCopy array one by one
        }

        System.out.println("Before sort numbsCopy = " + Arrays.toString(numbsCopy) ) ;

        Arrays.sort(numbsCopy) ;
        System.out.println("After sort numbsCopy = " + Arrays.toString(numbsCopy) ) ;

        // Check whether the array still have same content in same order after sorting
        // what method will check for content

        if (Arrays.equals(numbs, numbsCopy) ) {
            System.out.println("THIS IS ALREADY SORTED ") ;
        }else {
            System.out.println("THIS ARRAY IS NOT ALREADY SORTED ");
        }

        // plain english logic to see a set of 7 number is sorted or not
        // you copy this 7 number in another container
        // sort the number and check whether it still has same ordered as original number
        // why did we copy ? because if we directly sort original 7 item , we will lose order
        // and there be nothing to compare with

//        creating an array with same size as original array
//        int[] numbsCopy = new int[numbsItemCount] ;
//        numbsCopy[0] = numbs[0] ;    // 13 ;      // copying one by one from original array
//        numbsCopy[1] = numbs[1] ;
//        numbsCopy[2] = numbs[2] ;
//        numbsCopy[3] = numbs[3] ;
//        numbsCopy[4] = numbs[4] ;
//        numbsCopy[5] = numbs[5] ;









    }
}
