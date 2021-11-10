package day48;

public interface Bounceable {

    // ALL THE MEMBERS IN INTERFACE MUST BE PUBLIC
    // THIS IS EXCLUSIVE TO INTERFACE TYPE
    // NOWHERE ELSE YOU GET THIS AT ALL!!!!!!!!!!!!!!!!!!!!!!
    // if we don't add any part of public static final for the field
    // all interface fields are automatically public static final
   // double GRAVITY = 9.81;

   public static final double GRAVITY = 9.81 ;

    // every member of interface automatically public
    // if no access modifier is given
    // all the method with nobody automatically public abstract
    //void bounce();
    public abstract void bounce();


}
