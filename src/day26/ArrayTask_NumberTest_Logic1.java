package day26;

public class ArrayTask_NumberTest_Logic1 {

    public static void main(String[] args) {

        /*
         * 1 , given an int array
         * write a program to test all the elements in this int array are more than 100
         */

        int[] scores = {156, 101, 76, 187, 87, 110};
        int size = scores.length ;
        System.out.println("size = " + size);

        // create a variable called finalResult to store
        // your result of checking if every number in this array is more than 100 or not

        // if all numbers are more than 100 than make it YES, if not make it NO
        String finalResult = "";

        // LOGIC 1 .2 :
        // Take each item check if it is MORE than 100 , increase the count.
        // In the end, if count is equal to array item count the finalResult YES , answer is NO

        int cntMoreThan100 = 0;
        for (int eachNum : scores) {
            if (eachNum > 100) {
                ++cntMoreThan100;
            }
        }
        System.out.println("cntMoreThan100 = " + cntMoreThan100);
        // if all the numbers are more than 100 , it will have same count as item count
            if (cntMoreThan100 == size) {
                finalResult = "YES";

            } else {
                finalResult = "NO";
            }
            System.out.println("finalResult = " + finalResult);


            // LOGIC 2 :
            // Check each item and break when number is less than 100 after assigning final result to NO

            // LOGIC 3 :
            // minus 100 from all numbers in array and if any of the numbers are negative, it will be NO

            // LOGIC 4 :
            // Find min number if min number is more than 100 YES


    }
}