package day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListIntro {

    public static void main(String[] args) {

        // How do we create an ArrayList object

    }
    ArrayList<String> lst1 = new ArrayList<>() ;   //      new ArrayList<String>() ;

    // it will only store object!! NOT PRIMITIVE
    // ArrayList<int> lst2 = new ArrayList<int>() ;

    // Correct way to create arrayList object that store whole number
    // is to use Wrapper class type. Primitive type is FORBIDDEN !!!

    ArrayList<Integer> lst2 = new ArrayList<>() ;   //   new ArrayList<Integer>() ;

    ArrayList<Long> lst3 = new ArrayList<>() ;      //   new ArrayList<Long>() ;

    ArrayList<Double> lst4 = new ArrayList<>() ;    //   new ArrayList<Double>() ;

    // OPTIONALLY YOU CAN CREATE IN THIS WAY

    // List is a more general data type compared to ArrayList is more concrete type
    // ArrayList is one type of list
    // Just like Dog is one type of Animal
    List<String> myLst = new ArrayList<>() ;

}
