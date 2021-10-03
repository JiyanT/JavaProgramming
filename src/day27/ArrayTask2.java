package day27;

public class ArrayTask2 {

    public static void main(String[] args) {
        /*
        Task03 : write a program that returns the maximum number from an array
           DO NOT use sort method
         */

        int[] nums = {100, 10000, 9999, 8888, 1231, 2345 } ;
        int firstMax = nums[0] ;

        for (int i = 0; i < nums.length; i++) {
            if (firstMax < nums[i] ) {
                firstMax = nums[i] ;
            }
        }
        System.out.println("first max number : " + firstMax ) ;


        int secondMax = nums[0] ;
        for (int i = 0; i < nums.length ; i++) {
            if (secondMax < nums[i] && nums[i] != firstMax) {
                secondMax=nums[i] ;
            }
        }

        System.out.println("second max number : " + secondMax ) ;









    }
}
