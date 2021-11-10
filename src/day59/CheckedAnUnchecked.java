package day59;

import java.io.IOException;

public class CheckedAnUnchecked {

    public static void main(String[] args) {

        String x = "abc";
//        System.out.println(x.charAt(100));

        // Exception Hierarchy
//        Throwable  -->> child class -->>  Exception
        // Under Exception class,
        // there is one subclass known as RunTimeException
        // Anything IS-A RunTimeException regarded as UncheckedException,
        // UncheckedException are not required to be handled at compile time

        // How do we know the exception is UncheckedException
        // check whether it's a RunTimeException or subclass of RunTimeException

        // try to throw the exception programmatically if it compiles , it means it's RunTimeException
//        throw new RuntimeException("just throwing it out!") ;

        // what is checked exception
        // everything that subclass of Exception but not RunTimeException
        // programmers are required to handle(or declare) this type of exception

        // is the class Exception a type of checked exception or unchecked ?
        try {

            throw new IOException("just throwing this away");

        } catch (IOException e) {
            System.out.println("Exception caught");
        }


    }


}
