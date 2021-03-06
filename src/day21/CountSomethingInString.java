package day21;

public class CountSomethingInString {

    public static void main(String[] args) {

        // Find out count of all the word lia a in cases insensitive manner
        // I will go through each every letter of the String by 3 chars
        //           --->> each 3 characters I can use substring (0,2) and so on
        //           --->> going to 0 to two character before last char index ---->>> for loop

        // while I am going though each and every 3 characters
            // I will check whether current string I am looking at
            // equals to <lia> in case insensitive--->> current.Character.equalsIgnoreCase("lia")
            // if it is I will add 1 to my counter
            // if not -->> just move on
        // perform  this action until I reach last character
        // because last chance to get 3 characters is -->> 2 characters before last character

        String myName = "Mihran Yaman";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        int counter = 0 ;

        System.out.println("----3char-----");
        //  for (int x = 0 ; x <charCount-3 ; x++ ) { }
        for (int x = 0; x <= lastCharIndex - 2 ; x++) {

         // saving the current 3 characters
         String current3Char = myName.substring(x,x+3) ;

         if (current3Char.equalsIgnoreCase("lia") ) {

             System.out.println("The index of lia is " + x );
             // counter = counter + 1 ;
             // counter += 1 ;
             // counter++ ;
             ++counter ;
         }
        }

    }
}