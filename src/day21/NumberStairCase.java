package day21;

public class NumberStairCase {

    public static void main(String[] args) {

        /*
         * 1234   // count 1 to 4
         * 1234   // count 1 to 4
         * 1234   // count 1 to 4
         * 1234   // count 1 to 4
         * 1234   // count 1 to 4
         * do this 5 times
         */

        for (int x = 1; x <=5 ; x++) {
         //   System.out.println("x : " + x);

            for (int y = 1; y <=x ; y++) {
                System.out.print(y + " ");
            }
            System.out.println();
        }


    }
}
