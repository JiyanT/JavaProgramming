package day31;

public class MethodPractice1 {

    // DO NOT CREATE A METHOD INSIDE ANOTHER METHOD
    public static void main(String[] args) {
        // call directly since we are in same class
        sayHelloWorldTimes();
        // alternatively call using class name
        MethodPractice1.sayHelloWorldTimes();
        // you can call static method of other class
        // using classname.methodName(..)
        //    MethodIntro.sayHello();

        calculateMathProblem();
    }
    //  CAN NOT CREATE 2 METHODS WITH SAME EXACT METHOD HEADER
    // EVEN THOUGH IT HAS DIFFERENT THINGS INSIDE THE METHOD
//    public static void sayHelloWorldTimes() {
//        System.out.println("DO SOMETHING DIFFERENT ");
//    }


    // Create a method to print 7 line of hello and call it sayHelloWorldTimes


    public static void sayHelloWorldTimes() {

        // piece of code that you want to resume goes here
        // 3 print line statement
        System.out.println(" Hello world line 1 ");
        System.out.println(" Hello world line 2 ");
        System.out.println(" Hello world line 3 ");
        // 2 print line statement
        System.out.println(" Hello world line 4 ");
        System.out.println(" Hello world line 5 ");
        // 2 print line statement
        System.out.println(" Hello world line 6 ");
        System.out.println(" Hello world line 7 ");

    }


          /*
           int num1 = 5 ;
           double num2 =3.0d ;
           float num3 = 3.0f ;
           double result1 = num1 + num2 ;
           double result2 = num1 - num2 ;
           double result3 = num1 * num2 ;
           double result4 = num1 / num2 ;
           double result5 = num1 / num3 ;
           System.out.println(result1) ;
           System.out.println(result2) ;
           System.out.println(result3) ;
           System.out.println(result4) ;
           System.out.println(result5) ;
           Create a method to take above action, call it calculateMathProblem()
           */


    public static void calculateMathProblem() {
        int num1 = 5 ;
        double num2 =3.0d ;
        float num3 = 3.0f ;
        double result1 = num1 + num2 ;
        double result2 = num1 - num2 ;
        double result3 = num1 * num2 ;
        double result4 = num1 / num2 ;
        double result5 = num1 / num3 ;
        System.out.println(result1) ;
        System.out.println(result2) ;
        System.out.println(result3) ;
        System.out.println(result4) ;
        System.out.println(result5) ;



    }
}