package day16;



public class WhileLoopPractice {

    public static void main(String[] args) {


        int x = 100 ;

        while (x <=105 ) {
            System.out.println("Hello World");
            x++ ; // It will change the value next time the x shows up
         // ++x ; // It will increase the value by I right away


        }

        /*
        *
        * iteration 1   x=00
        *       check 100 <=105 --->> true
        *       "Hello World"
        *        x= 101
        *
        * iteration 2   x= 101
        *       check 101<=105 ---->>>true
        *       "Hello World"
        *         x=102
        *
        * iteration 3
        *       check 102<=105--->>> true
        *       x=103
        *
        * iteration 4
        *       check 103<=105 ---->> true
        *       x= 104
        *
        * iteration 5
        *      check 104<=105 ----->>> true
        *      x= 105
        *
        * iteration 6
        *      check 105<=105
        *      x=105
        *
         */





    }
}
