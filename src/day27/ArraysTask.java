package day27;

public class ArraysTask {

    public static void main(String[] args) {
         /*
        Task02 :
         write a program that can find the minimum number from an int array
         DO NOT use sort method

          write a program that can find the second minimum number from an int array
         DO NOT use sort method
           */

        int[] scores = {100, -90, 8000, 10, 20, -1, 7, 5, 6, 4} ;
        int min= 9999999 ;

        for (int i =0; i<scores.length; i++) {
            if (min>scores[i] ) {
                min=scores[i] ;
            }
        }
        System.out.println("First Minimum number : " + min );

        int secondMin = scores[0] ;
        for (int i = 0; i < scores.length; i++) {
//            if (scores[i] ==min){
//                continue;
//            }
            if (secondMin > scores[i] && scores[i] != min) {
                secondMin = scores[i];
            }
        }
        System.out.println("Second Minimum number is : " + secondMin);

        int thirdMin = scores[0] ;
        for (int i = 0; i < scores.length; i++) {
//            if (scores[i]==min || scores[i]==secondMin) {
//                continue ;
//            }
            if (thirdMin>scores[i] && scores[i] !=min && scores[i] !=secondMin ) {
                thirdMin=scores[i] ;
            }
        }
        System.out.println("Third Minimum number : " + thirdMin);










    }
}
