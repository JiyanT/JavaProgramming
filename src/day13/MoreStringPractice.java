package day13;

public class MoreStringPractice {

    public static void main(String[] args) {

        String name = "Jiyan" ;

       System.out.println(name) ;
     //   name= "Merat" ;
     //
     //   System.out.println(name);

        // String is immutable , one created it can not be changed
        // any String actions/ methods that looks like changing the value
        // actually creating a new String

        name.toUpperCase() ;
        System.out.println(name);

        System.out.println(name.toUpperCase());

        // WHAT IF I REALLY WANT TO CHANGE THE NAME

        name = name.toUpperCase();
        System.out.println(name);


    }
}
