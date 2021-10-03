package day24;

public class ForEachLoopReadOnly {

    public static void main(String[] args) {

        int yourFavNumber = 300 ;
        int myFavNumber   = yourFavNumber ;

        myFavNumber = 299 ;

        System.out.println(yourFavNumber) ;

        long[] numbs = {10, 40, 20 } ;
        // how do I change double my first item in the array
        // numbs[0] = numbs[0] * 2 ;   // numbs[0] *=2 ;
        // System.out.println(numbs[0]);

        for (int x = 0; x < 3; x++) {
        // System.out.println( numbs[x] * 2 ) ; // JUST PRINTING WON'T CHANGE THE VALUE
          long  eachItem = numbs[x] ;
          eachItem = 100 ;
        // numbs[x] = numbs[x] * 2 ;    // here we are doubling the value of each time
        }

        for (long eachItem : numbs) {
            eachItem= 100 ;
        }
        // NEVER USE FOR EACH LOOP TO MODIFY ARRAY ITEMS

        // how do I know array items are modified or not re-print
        System.out.println("AFTER WE MODIFY THE VALUE");
        for (int x = 0; x < 3 ; x++) {

            System.out.println( numbs[x]  ) ;

        }




    }
}
