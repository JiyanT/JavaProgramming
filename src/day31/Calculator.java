package day31;

public class Calculator {

    public static void main(String[] args) {

        // create a static method that add
        // it accept 2 numbers and print the result of addition
        add(6,23) ;
        add(2,4) ;
        add(66,66) ;
        add3Numbers(2,4,6);
        add3Numbers(66,67,68);
    }

    // a static method that has 2 int parameter

    public static void add(int num1 , int num2 ) {

        System.out.println(" Addition result : " + (num1 + num2));
    }

    public static void add3Numbers(int num1 , int num2 , int num3 ) {
        System.out.println( "add 3 numbers result " + (num1+num2+num3) ) ;
    }
}
