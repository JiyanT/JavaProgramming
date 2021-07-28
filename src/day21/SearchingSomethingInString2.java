package day21;

public class SearchingSomethingInString2 {

    public static void main(String[] args) {

        // Find out index of all the word an in cases insensitive manner
        // I will go through each every letter of the String by 2 character
        //              --->> each character I can use substring (0,2) and so on
        //              --->> going to 0 to one character before last char index  ---->>> for loop

        // while I am going though each and every 2 character
            // I will check whether current string I am looking at
            // equals to <an> in case insensitive manner--->>current.Character.equalsIgnoreCase("an")
            // if it is I will print the index ( the variable you use to keep the index )
            // if not -->> just move on
        // perform  this action until I reach one character before last character
        // because last chance to get 2 character is -->> right before last character
        String myName = "Hasan Mammadov";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        System.out.println("----2char-----");
        //  for (int x = 0 ; x <charCount-2 ; x++ ) { }
        for (int x = 0; x <= lastCharIndex-1 ; x++) {

         String current2Char = myName.substring(x,x+2) ;

         if (current2Char.equalsIgnoreCase("an" ) ) {

             System.out.println("The index of an is " + x );
         }
        }
    }
}