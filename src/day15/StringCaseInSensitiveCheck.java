package day15;

public class StringCaseInSensitiveCheck {

    public static void main(String[] args) {

        String name = "Arya Stark" ;

        System.out.println(  "name contains st  RESULT IS "  + name.contains("st")  ) ;


        // I wanna check whether this name contains st no mather the case
        // So I want to store the uppercase version of this name then check for ST

        String upperCaseName = name.toUpperCase() ; // "ARYA STARK"
        System.out.println( "upperCaseName contains ST or not? " + upperCaseName.contains("ST"));

        String lowercaseName = name.toLowerCase() ; // "arya stark"
        System.out.println("lowercaseName contains st or not? " + lowercaseName.contains("st") );


        // This is called method chaining , combining multiple method call
        // Make my name all lowercase (String) then check whether it contains lowercase st
        // THIS WORK BECAUSE name.toLowerCase() result in another String object

        System.out.println(name.toLowerCase().contains("st")  ); // THIS WORK
        // System.out.println(name.length().toUppercase() ); bad idea!!!

    }
}
