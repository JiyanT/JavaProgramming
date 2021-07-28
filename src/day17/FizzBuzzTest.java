package day17;

public class FizzBuzzTest {

    public static void main(String[] args) {

        // if a number can be divided by both 3 and 5 --->>>? Fizz Buzz Number
        // if a number can be divided by 5            --->>>? Fizz Number
        // if a number can be divided by 3            --->>>? Buzz Number

      //  int num = 21 ;
      //   if (num%5==0 && num%3==0) {
      //       System.out.println(num + " is Fizz Buzz Number" );
      //   }else if (num%5==0) {
      //       System.out.println(num + " Fizz Number ");
      //   }else if (num%3==0) {
      //       System.out.println(num + " is Buzz Number");
      //   }else {
      //       System.out.println(" NOT A FIZZ BUZZ NUMBER AT ALL!! ");
      //   }

       int num = 1 ;
       while ( num<=50 ) {

             if (num%5==0 && num%3==0) {
                 System.out.println(num + " is Fizz Buzz Number" );
             }else if (num%5==0) {
                  System.out.println(num + " Fizz Number ");
              }else if (num%3==0) {
                  System.out.println(num + " is Buzz Number");
              }
             ++num ;
       }




    }
}
