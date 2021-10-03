package day32;

public class NumberAction {

    public static void main(String[] args) {

        repeatString("Java" , 3 ) ;
        repeatString("DO NOT TOUCH WORKING CODE", 10 ) ;
        skipCountBy3From0To50();
        countDownByEvenNumberFromXToY(10,6) ;
        countDownByEvenNumberFromXToY(6,10);
        countDownByEvenNumberFrom50To0();
    }



    /**    == 1 ==
     * repeatString
     * this method has 2 parameters
     *    String strToRepeat and int count
     *    repeat printing the string as many times as <count> number define
     * repeatString("Java" ,3) --->> Java Java Java
     */
    public static void repeatString(String strToRepeat, int count ) {

        for (int i = 1; i <= count ; i++) {
            System.out.println(strToRepeat + " ") ;
        }
        System.out.println();
    }




    /**      == 2 ==
     *  * numberComparison
     *      * this method has 2 parameters called num1 and num2
     *      * if num1 is more than num2 print num1 is more than num2
     *      * if num2 is more than num1 print num2 is more than num2
     *      * if num2 is equals num1 print they are equal
     *      *
     * @param number1
     * @param number2
     */
    public static void numberComparision(int number1, int number2) {

        if (number1 > number2) {
            System.out.println(" num1 is more than num2 ");
        }else if (number2 > number1) {
            System.out.println(" num2 is more than num1 ");
        }else {
            System.out.println(" they are equal ");
        }
    }




    /**      == 3 ==
     *  skipCountBy3From0To50
     */
    public static void skipCountBy3From0To50() {
        for (int i = 0; i < 50; i= i + 3 ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }




    /**       == 4 ==
     *  print1toX
     * create a method that has 1 int parameter called x
     * print from 1 to that number in one line
     * print an empty line after the print.
     *   This method will print from 1 to the number user passed
     * @param x
     */
    public static void print1toX(int x){
        for (int i = 1; i < x; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
    }




    /**      == 5 ==
     *    countDownByEvenNumberFrom50To0
     *    create a method that has no parameter
     *    and count Down By Even Number From 50 to 0
     *    for example 50 , 48 , 46, ...... 0
     */
    public static void countDownByEvenNumberFrom50To0() {
//        for (int i = 50; i >= 0; i--) {
//            if (i % 2 == 0) {
//                System.out.print(i+ " ");
//            }
//        }
//        System.out.println();
        countDownByEvenNumberFromXToY(50,0);
    }





    /**     == 6 ==
     * instead of countDownByEvenNumberFrom50To0
     * now count Down By EvenNumber From x To y
     * @param x
     * @param y
     */
    public static void countDownByEvenNumberFromXToY(int x, int y){
        for (int i = x; i >= y ; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }





    /**
     * Create static void methods as below
     *
     *    create a method that has no parameter
     *    and skip count by 3 from 0 to 50
     */









}
