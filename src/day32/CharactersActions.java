package day32;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class CharactersActions {

    public static void main(String[] args) {
//        printAToZ() ;
//        printZToA();
        printAlphabetInRange('a','f') ;
        printAlphabetInRange('G','B') ;
        printAlphabetInRange('A','A') ;
        printAlphabetInRange('a','A') ;
        printAlphabetInRange('Z','a') ;

    }
    /*
    * if beginning character is before ending character
    * for example A , ending D --->> ABCD
    * we did similar action with printing A-Z
    *  <p>
    * if beginning D , ending A , --->>> DCBA
    * we did similar action with printing Z-A
     */
    public static void printAlphabetInRange(char beginning , char ending ) {
        // this mean beginning character comes before ending character
        // in ascii table
        if (beginning < ending ) {
            System.out.println("WE NEED TO INCREMENT FROM " + beginning + " till " +ending ) ;
            for (char iChar = beginning; iChar <= ending  ; iChar++) {
                System.out.print(iChar + " " ) ;

            }
            System.out.println();
        }else if(beginning>ending){
            System.out.println("WE NEED TO DECREMENT FROM " + beginning + " till " + ending ) ;
            for (char iChar = beginning; iChar >= ending; iChar--) {
                System.out.print(iChar + " " ) ;
            }
            System.out.println();
        }else {
            System.out.println( "THEY ARE SAME CHARACTER !!!! " ) ;
        }

    }
    /*
    * printAToZ
    * create a method that has no parameter
    *  and print A-Z
     */
    public static void printAToZ() {
        // 'A' ++ ---> 'B'
        for (char iChar = 'A'; iChar <= 'Z' ; iChar++) {
            System.out.print(iChar + " ") ;
        }
        System.out.println(); // so we can move to next line
    }
    /*
     * printZToA
     * create a method that has no parameter
     *  and print Z-A
     */

   public static void printZToA() {
       // this is hiw we can print in descending order
       // 'Z' --    ---> 'Y'
       for (char iChar = 'Z'; iChar >= 'A' ; iChar--) {
           System.out.print(iChar+ " ");

       }
       System.out.println(); // so we can move to next line
   }

}
