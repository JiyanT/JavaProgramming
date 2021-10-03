package officeHour;

import sun.jvm.hotspot.debugger.posix.elf.ELFSectionHeader;

public class Practice_11_26 {

    public static void main(String[] args) {

        // Nested If statement :
        //                       If statements under another is statement
        // Nested -->> one thing inside another thing

        // Pseudocode :
        //               You have option to buy food and drink
        //               Under food you can buy meal or snack
        //               Under the drink you can buy soda or juice

        /*
        IF YOUR SELECTION IS FOOD
             WHAT KIND DO YOU WANT ? MEAL OR SNACK
        IF YOUR SELECTION IS DRINK
             WHAT KIND DO YOU WANT ? SODA OR JUICE
         */

        String mainOptions = "Food" ;
        String secondaryOption = "Snack" ;

        if (mainOptions.equalsIgnoreCase( "food" ) ) {
            System.out.println( "You have selected food " ) ;
            if (secondaryOption.equalsIgnoreCase("snack" ) ) {

                System.out.println( " YOU HAVE SELECTED SNACK " ) ;
            }else if (secondaryOption.equalsIgnoreCase("meal" ) ) {
                System.out.println("YOU HAVE SELECTED MEAL");
            }else{
                System.out.println(" NO SUCH FOOD OPTION ");
            }
        }


    }
}
