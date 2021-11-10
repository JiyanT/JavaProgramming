package day34;

import java.util.Arrays;

public class MethodOverloadingInto {

    public static void main(String[] args) {


        System.out.println("Method overloading");
        System.out.println(12);
        //             01234567890
        String name = "Overloading" ;
        System.out.println(name.substring(6) ) ;
        System.out.println(name.substring(1,4) ) ;

        // two version of indexOf method (there are 4)
        System.out.println(name.indexOf("di") ) ;
        System.out.println(name.indexOf("o", 2) ) ;
        System.out.println("======================");

        // Arrays.toString has 9 different version to accept different parameter


        // Method overloading :
        // using same name and different parameter for different methods
        // to reuse the name for similar action
        // IT DOES NOT CONCERN RETURN TYPE AND ACCESS MODIFIER

        // method name + parameter list = method signature

        // WE CAN NOT HAVE 2 METHODS WITH SAME METHOD NAME AND SAME METHOD PARAMETERS
        sayHello();
        sayHello("Jiyan");
        sayHello("Universe");
        sayHello(100);
        System.out.println(sayHello(" Muge","Orman") ) ;
      //  sayHello( "abc", 12 ) ;

    }
    public static void sayHello() {
        System.out.println("Hello, World");
    }

    public static void sayHello (String name) {
        System.out.println( "Hello, " + name ) ;
    }

    public static void sayHello (int num) {
        System.out.println("Hello, " + num);
    }
     //    this is regarded as same method as above method
//    public static void sayHello ( int x ) {
//       }
    public static String sayHello(String firstName , String lastName) {
        return "Hello" + firstName + " " + lastName ;
    }












    }
