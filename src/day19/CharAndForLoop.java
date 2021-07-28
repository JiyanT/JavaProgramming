package day19;

public class CharAndForLoop {

    public static void main(String[] args) {

        // each character has it's corresponding ascii value
        // from ascii table

      // int x = 'A' ;
      //  System.out.println(x) ;


        char myChar = 'A' ;

        System.out.println(myChar);
        // 'A' + 1 --->>> 65 + 1 =66 --->>> 'B'  ( myChar datatype is char )
        System.out.println(++myChar);
        // 'A' + 1 --->>> 66 + 1 =67 --->>> 'C'  ( myChar datatype is char )
        System.out.println(++myChar) ;
        // 'A' + 1 --->>> 67 + 1 =68 --->>> 'D'  ( myChar datatype is char )
        System.out.println(++myChar) ;
        // 'A' + 1 --->>> 68 + 1 =69 --->>> 'E'  ( myChar datatype is char )
        System.out.println(++myChar) ;
        // 'A' + 1 --->>> 69 + 1 =70 --->>> 'F'  ( myChar datatype is char )

        System.out.println('A'>'B');  // 66>67
        System.out.println('Z'>'B');



        for (char iChar= 'A' ; iChar <= 'Z' ; iChar++ ) {

            System.out.print(iChar + " " );
        }
        System.out.println();

        for (char kChar = 'Z'; kChar >= 'A'; kChar--) {

            System.out.print( kChar + " " );

        }



    }
}
