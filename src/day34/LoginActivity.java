package day34;

public class LoginActivity {

    public static void main(String[] args) {

        loginVoid("my username", "abc123");
        loginVoid("user", "abc123");

        boolean result = loginReturn("user", "abc123");
        System.out.println("result = " + result);

        System.out.println("second run " + loginReturn("aaaa", "bbb"));
        // System.out.println(loginVoid("aaaa", "bbb") ) ; CAN NOT DO IT WITH VOID METHOD
        //  boolean result2 = loginVoid("abc", egf) ;

        if (loginReturn("user", "abc123")) {
            System.out.println("add Java Book to cart");
            System.out.println("Pay for Java Book in cart");
            System.out.println("View the order");
        }else {
            System.out.println("NO SHOPPING UNLESS YOU SIGNED IN !!!");
        }
    }

    public static void loginVoid(String user, String password ) {

        if (user.equals("user") && password.equals("abc123")) {
            System.out.println("LOGIN SUCCESSFULLY");
        } else{
            System.out.println(" LOGIN FAILED ");
        }
    }
        public static boolean loginReturn(String user, String password ) {

            return user.equals("user") && password.equals("abc123") ;
    }



//        if (user.equals("user") && password.equals("abc123") ) {
//            return true ;
//        }else {
//            return false ;  }
}














/**
 *  1,   LOGIN1 :  static void method
 *  it has two String method parameters
 *     called username and password
 *     (it accepts 2 String object as argument when being called)
 *     it checks whether username and password "user" and "abc123"
 *
 *     if yes
 *        print login successfully
 *        else
 *        print login failed (OPTIONALLY FIND EXACTLY WHY FAILED)
 *
 * 2,    LOGIN2 : static method boolean return type
 *      it has two String method parameters
 *          called username and password
 *    (it accepts 2 String object as arguments when  being called )
 *    it checks whether username and password "user" and "abc123"
 *
 *    if yes
 *       return true
 *    else
 *       return false
 */