package day37;

import java.util.ArrayList;
import java.util.List;

public class TeamMateListPractice {

    /**
     * Warm up :
     * Create ArrayList of String and store
     * teamMates
     * print one by one
     * print reverse
     * print first last
     * print 2 at a time
     * concat everyone in one String separated by
     * @param args
     */

    public static void main(String[] args) {

     //   ArrayList<String> teamMates = new ArrayList<>() ;

        List<String > teamMates = new ArrayList<>() ;
        
        teamMates.add("Akbar") ;
        teamMates.add("Kuzzat") ;
        teamMates.add("Muradil") ;
        teamMates.add("Maruf") ;
        teamMates.add("Vasly") ;
        teamMates.add("Muhtar") ;
        teamMates.add("Asiye") ;
        teamMates.add("Mike") ;
        teamMates.add("Guljannat") ;
        //teamMates.add("Support Team") ;

        System.out.println("teamMates = " + teamMates);

        // first item
        System.out.println("First item = " + teamMates.get(0) ) ;

        // last item -->> using last index -->> size()-1
        int lastItemIndex = teamMates.size()-1 ;
        System.out.println("Last Item = " + teamMates.get(lastItemIndex));

        // print one by one
        System.out.println("\nALL ITEMS : ");
        for (int x = 0; x < teamMates.size() ; x++) {

            System.out.println("\tItem " + (x+1) + " = " + teamMates.get(x));

        }
        System.out.println("\nALL ITEMS in reserve order : " );

        for (int x =lastItemIndex ; x >=0 ; x--) {

            System.out.println("\tItem " + (x+1) + " = " + teamMates.get(x));

        }
        // print 2 items at a time
        // for example : 1-2, 2-3, 3-4, 4-5, 5-6, 7-8, 9-10 ....
        System.out.println("\nPrint 2 items at a time : ");
        for (int x = 0; x <= teamMates.size()-2 ; x++) {
          //  System.out.println("x and x+1 = " + x + "---" + (x + 1) ) ;
            System.out.println("\t" + teamMates.get(x) + "---" + teamMates.get(x+1) );


        }
        // print 2 items at a time
        // for example : 1-2, 2-3, 3-4, 4-5, 5-6, 7-8. ....
        System.out.println("\nPrint 2 items at a time without repeating : ");

        for (int x = 0; x <= teamMates.size()-2 ; x +=2) {
          //  System.out.println("x and x+1 = " + x + "---" + (x + 1) ) ;

            System.out.println("\t" + teamMates.get(x) + "---" + teamMates.get(x+1) );

        }

        // Challenge : Pair them up by 3

        // concat everyone in one String separated by

        String result = "" ;
        for (int i = 0; i < teamMates.size() ; i++) {

            result = result + teamMates.get(i) + "-";

        }
        System.out.println("result = " + result);

        // TODO : Remove the Dash

        // TODO: How can we turn a List into a String and Store it? and manipulated

        String lstToString = teamMates.toString() ;
        System.out.println("lstToString after replacing  = \n\t"
                           + lstToString.replace(",", "-")
                .replace("[" ,"")
                .replace("] " ,"")
        );
        
        
    }
}
