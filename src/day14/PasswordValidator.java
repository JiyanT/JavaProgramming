package day14;

public class PasswordValidator {

    public static void main(String[] args) {



    // PASSWORD VALIDATOR

    // MINIMUM 8 CHAR MAX 16 CHAR
    // IT MUST CONTAINS _ OR $
    // IT MUST NOT CONTAINS SPACE
    // IT MUST START WITH Ab

    // if any of above condition does not match say invalid password
    // else say GOOD PASSWORD
    String password = "AbH2723gfgdsu_";

    // MINIMUM 8 CHAR MAX 16 CHAR
    boolean min8max16 = password.length() >= 8 && password.length() <= 16;

    // IT MUST CONTAINS  _ OR $
    boolean mustContains_or$ = password.contains("_") || password.contains("$");
    //

    // IT MUST NOT CONTAINS SPACE
    boolean mustContainsSpace = !password.contains(" ");
    //

    // IT MUST START WITH Ab
    boolean mustStartsWithAb = password.startsWith("Ab");
    //


        if (min8max16 && mustContains_or$ && mustContainsSpace && mustStartsWithAb) {
        System.out.println("VALID PASSWORD");
    } else {
        System.out.println("INVALID PASSWORD");
    }

}
}