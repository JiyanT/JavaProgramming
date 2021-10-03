package day24;

import java.util.Arrays ;

public class ArraysClassMethod {

    public static void main(String[] args) {

     // Arrays class a class coming from java.util package
     // It has a lot of pre-built method to work with array object

     // for printing the content of the array
     // toString ---->> Arrays.toString(yourArrayHere)
     // This method will give you string representation of any type of array
     // the result will look --->>> [item] , item 2 , item 3 ....... lastItem]

        String[] superHeroes = {"Superman", "Batman", "Wonder Woman", "Aquamarine", "Cyborg", "Flash"} ;

     // System.out.println(superHeroes) ;
        System.out.println("Arrays.toString(superHeroes) result :    ");
        System.out.println(   Arrays.toString(superHeroes)  ) ;

     // saving the string result into a variable and print
        String superHeroesAsString  = Arrays.toString(superHeroes) ;

        System.out.println(" superHeroesAsString result :    ");
        System.out.println( superHeroesAsString ) ;

        // how do we get first character of SuperHeroesAsString variable
        System.out.println(" superHeroesAsString.charAt(0) result :    ");
        System.out.println( superHeroesAsString.charAt(0) ) ;

        System.out.println("-------------------------------------");


        int[] numbers = {10,44,55,3,78} ;
        System.out.println( "Arrays.toString(numbers) RESULT   : " ) ;
        System.out.println(Arrays.toString(numbers) ) ;

        // create a double(datatype) array of 3 items called prices; and put 3 value
        // get a String representation out of this array and save it as pricesString
        // print each and every character in this String in this format
        // for example : your first 2 line of output should look like this
        // character at index 1 is : yourCharacterHere
        // character at index 1 is : yourCharacterHere and so on  all the way till last
        double[] prices =new double[] {  3.14,  5.5,  9.9  } ;

        System.out.println(" Arrays.toString(prices) result : " +   Arrays.toString(prices) ) ;
        // since the method give you back a string representation of array object
        // in this format [ firstItem , secondItem , thirdItem .......... lastItem ]
        // i can save it into String variable

        String pricesString = Arrays.toString(prices) ;
        System.out.println( " pricesString = " + pricesString );

        // we are looping over a String not an array so we after at last character finishes
        for (int i = 0 ; i < pricesString.length() ; i++) {

            System.out.println( " Character at index " + i + " is : " + pricesString.charAt(i) ) ;

        }
      // THE SOLE PURPOSE OF Arrays.toString(yourArray) is TO SEE WHAT IS INSIDE

     // for sorting an array in ascending order
     // sort ---->>> Arrays.sort(yourArrayHere)

     // for checking for equality of 2 array object content
     // equals ---->>> Arrays.equals(firstArray, secondArray)




    }
}
