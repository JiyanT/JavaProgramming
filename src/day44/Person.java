package day44;

import java.util.stream.Stream;

public class Person {

    // instance field : belong to the instance(object)
    // every Person object will get their own name and age
    // changing the value of one object does not affect another

   private String name ;
   private int age ;

    // static field : belong to the class (type itself)
    // there is only one copy of this value shared by all the objects
    // created out of this Person template|blueprint
   public static String species ;

   public Person(String name,int age) {
       this.name = name ;
       this.age = age ;
   }
   public String  getName() {
       return name;
   }
   public int getAge() {
       return age ;
   }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                '}';
    }
}
