package day33;

    /**
     * Practice method with return type
     * @author Jiyan
     *
     * return keyword is used to return a value out of a method
     * it also used to get out of your method
     * the moment the return line get executed, the method will finish running
     */
    public class ReturnKeywordPractice {

    public static void main(String[] args) {
        System.out.println( calculateAgeFromBirthYear(1977) ) ;

    }
    /**
     *  calculateAgeFromBirthYear
     *  This method will
     *  calculate the age according to the birth year
     *  and return the age
     *  @param birthYear the number that represent birth year
     *  @return the calculated value from the age
     *          if the birth year is not within 1900-2020 return 0
     *
     *  OPTIONALLY :
     *  test your code against array of birthYears
     *  {1999,122,2019,1987,1978,1964,3999,2004}
     */
    public static int calculateAgeFromBirthYear(int birthYear) {
        // I want to take out negative scenario first and just return 0

        if (birthYear<=1900 || birthYear>=2020){
            return 0 ;
        }
        // if I reach this point, it means the birth year is valid
        return 2019 - birthYear ;
    }





}

