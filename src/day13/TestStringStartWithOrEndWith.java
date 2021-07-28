package day13;

public class TestStringStartWithOrEndWith {

    public static void main(String[] args) {


        String name = "Jiyan" ;

        // check if a String start with  another String
        // IT IS CASE SENSITIVE
        System.out.println(name.startsWith("Ji") ) ;
        System.out.println(name.startsWith("ji") ) ;
        System.out.println(name.startsWith("Me"));

        // check if a String start with  another String

        System.out.println(name.endsWith("n"));
        System.out.println(name.endsWith("M"));
        System.out.println(name.endsWith("N"));

    }
}
