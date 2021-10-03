package day32;

public class StringAction {

    public static void main(String[] args) {

        // reversePrintMyOwnName() ;
        // String name = "Jiyan" ;
        printStringWithDashInBetween("Merat");
        printStringWithDashInBetween("Sermin");
        printStringWithDashInBetween("Ferhat");
        printStringWithDashInBetween("Nazli");
        printStringWithDashInBetween("Mizgin");
        printStringWithDashInBetween("Sirin");

    }

    // printStringWithDashInBetween
    // it has one String parameter called name
    // it will do following in method body
    // print each and every character of a String with dash in between
    // excluding the last one Akbar -->> A-k-b-a-r
    // logic: keep concatenating - after each character
    // when it comes to last character don't add it
    public static void printStringWithDashInBetween(String name) {
        // String name = "Jiyan" ;
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            // if I am not at the last index then I print -
            if (i != name.length() - 1) {
                System.out.print("-");
            }
        }
        System.out.println();
    }
    /*
     * reversePrintMyOwnName
     * create a method that has no parameter
     * and print your name in reversed order
     */

    //    public static void reversePrintMyOwnName() {
    //        //             01234
    //        String name = "Jiyan" ;
    //        // start from last character and print toward first character
    //        // put dash in between
    //
    //        for (int i = name.length()-1 ; i >= 0  ; i--) {
    //            System.out.print(name.charAt(i));
    //        }
    //        System.out.println();
    //    }


}
