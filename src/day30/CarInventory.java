package day30;

import java.util.Locale;

public class CarInventory {

    public static void main(String[] args) {

        String[] cars = { "Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMen",
                "BMW-7 Series",
                "Oldsmobile-Achieve",
                "Honda-Civic" } ;

        // Task 1 : count Chevrolet and civicCnt
        // we can use contains , startWith , endWith to get same result

        int chevyCnt = 0 ;
        int civicCnt = 0 ;

        for (String eachCar : cars ) {
           // if (eachCar.startsWith(" Chevrolet ") ) {
           // what if I want case insensitivity
            if (eachCar.toLowerCase().startsWith("chevrolet") ) {
                chevyCnt++ ;
            }
            if (eachCar.toUpperCase().contains("CIVIC") ) {
                civicCnt++ ;
            }
        }
        System.out.println("chevyCnt = " + chevyCnt);
        System.out.println("civicCnt = " + civicCnt);






    }
}
