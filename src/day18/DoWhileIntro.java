package day18;

public class DoWhileIntro {

    public static void main(String[] args) {

        // {} curly braces
        // [] square bracket
        // () parenthesis
        // ; semi colon
        // : colon
        // % remainder operator
        // ! exclamation mark
        // | pipe
        // & Ampersand
        // \ backslash
        // / forward slash
        // " double quate
        // ' single quate


        // count from 1 to 5 ;

        //      do {
        //           take some action here and repeat it
        //         } while ( some condition is true ) ;

        int x = 1 ;

        do {
            System.out.println(x);
            ++x ;
        }while (x<=5) ; // semi colon ; is mandatory



        System.out.println("------------");
        // count from 5 to 1 :
        int y = 5 ;

        do {
            System.out.println(y);
            --y ;

        }while (y>0) ;

    }
}
