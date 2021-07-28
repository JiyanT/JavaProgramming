package day11;

public class ScoreChecker {

    public static void main(String[] args) {

        int score = 10 ;
         if (score<0 || score>100){
             System.out.println("INVALID SCORE!!!!");
         }else if (score==100){
             System.out.println("PERFECT SCORE");
         }else if (score> 70 && score<100){
             System.out.println("YOU HAVE PASSED!!!");
         }else{
             System.out.println("you have failed !!!!");
         }


    }
}
        // SCORE = 10000
        // score>70 || score<100
    /*
    * Create e a program to check the score : ScoreChecker with main method
    * Create a variable called score assign a value of your choice
    * If the score is less than 0 or more than 100 -->> INVALID SCORE!!!
    * If the score is 100 -->> PERFECT SCORE
    * If the score is  between 70-100 -->> YOU HAVE PASSED!!!
    * Else you have failed !!!!
     */