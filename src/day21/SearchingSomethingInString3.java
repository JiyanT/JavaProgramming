package day21;

public class SearchingSomethingInString3 {

    public static void main(String[] args) {

        String myName = "Mihran Yaran  Jiran Meran ";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        System.out.println("----3char-----");
        //  for (int x = 0 ; x <charCount-3 ; x++ ) { }
        for (int x = 0; x <= lastCharIndex-2 ; x++) {

            // saving the current 3 characters

         String current3Char = myName.substring(x,x+3) ;
         if (current3Char.equalsIgnoreCase("ran") ) {
             System.out.println("The index of ran is " + x );
         }
        }
    }
}