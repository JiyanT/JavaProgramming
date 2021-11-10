package day47;

// I don't need to create car object using this class
// I only want this class to be super class to provide
// reusable fields and methods for subclasses
// This class is designed to be a super class
public abstract class Car {

    int year ;
    String brand ;

    // abstract class can have abstract method
    // ONLY ABSTRACT CLASS CAN HAVE ABSTRACT METHOD
    // it has abstract keyword,
    // and it does not have body , DOES NOT HAVE {}
    // it ends with ;
    // IT'S MEANT TO BE OVERRIDDEN TO PROVIDE BODY
    // IN SUB CLASS
   public abstract void start() ;

   public abstract void goForward() ;

   public abstract void goBackWard() ;

   public abstract void turn(String direction) ;

    public static void doStaticThing() {
        System.out.println("Static method can be in an abstract class");
    }

       public void doCarThing() {
           System.out.println("non abstract method can be in an abstract class");
       }



    // add abstract void methods :
    // goForward
    // goBackWard
    // turn(String direction)


}
