package day32;

public class MethodWithReturnTypePractice {

    public static void main(String[] args) {
       // System.out.println(10,0);
        System.out.println(divide(10,3) ) ;
        System.out.println(divide(10,0) ) ;
        System.out.println(divide(0,10) ) ;

    }
    // create a method called seniorCitizen

    /**
    *  create a method called divide
    * it has 2 double parameters and return the result of as double
     *
     * @param num1
     * @param num2
     * @return  the division result
     * if num2 is 0 , it will just return 0
     */


    public static double divide(double num1 , double num2 ) {
        // to avoid getting the result we did not want

        if (num2==0){    // we check if num2 is 0
            return 0 ;   // if it is we just return 0
        } else{    // if not ,
        return num1/num2 ;  // we just return actual result
        }
    }










}
