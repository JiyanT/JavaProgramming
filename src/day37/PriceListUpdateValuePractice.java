package day37;

import java.util.ArrayList;
import java.util.List;

public class PriceListUpdateValuePractice {

    public static void main(String[] args) {

        //   ArrayList<String> teamMates = new ArrayList<>() ;

        List<Double> priceList = new ArrayList<>() ;

        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        System.out.println("priceList = " + priceList);
        // change the third price to 10 $
        // third item index is 2
        // and set method use index and new value as arguments when being called
        priceList.set(2,10.0) ;
        System.out.println("third item new price = " + priceList.get(3));

        // Add 4 dollar to first price : your first price should be original price + 4
        priceList.set(0, priceList.get(0)+4 ) ;
        System.out.println("first item new price = " + priceList.get(0));

        // change last price to sum of first and second price
        Double sumOfFirst2Items = priceList.get(0) + priceList.get(1) ;
        priceList.set(priceList.size()-1 , sumOfFirst2Items) ;

        System.out.println("New priceList = " + priceList);

        //give 40% off to second price, so our new price should be 40% less than original price which is 60%
        priceList.set(1, priceList.get(1)*0.60 ) ;

        System.out.println("AFTER 40% OFF second item value is = " + priceList.get(1));

        // DOUBLE THE VALUE OF EACH AND EVERY PRICE IN THE LIST
        // this is how we do it for one , now we do it for all of them by replacing the index with variable

        // in order to update an item we need an index and new value
        // in order to update the first value index will be 0
        // in order to double the price from original, first we need to get the original value
        // then multiply by 2 and use that value for 2nd parameter of set method
//        double newValue = priceList.get(0) *2 ;
//        priceList.set(0, newValue ) ;
        System.out.println("priceList Before doubling = " + priceList);
        System.out.println("===============");

        for (int i = 0; i < priceList.size(); i++) {
            double newVal = priceList.get(i) * 2 ;
            priceList.set(i,newVal) ;
          //  priceList.set(i,priceList.get(i) * 2 ) ;
        }
        System.out.println("priceList after doubling = " + priceList);

        // cut the price into half if the price is more than 20$
        for (int i = 0; i < priceList.size(); i++) {

            double eachPrice = priceList.get(i) ;
            if (eachPrice>20) {
                priceList.set(i, eachPrice/2) ;
            }
        }
        System.out.println("priceList after cutting half the prices more than 20 : \n\t " + priceList);
        int lastIndex = priceList.size()-1 ;
        // swap the first value with the last value
        double temp = priceList.get(0) ;       // store the first value in temp, so we can assign it to the last later
        priceList.set(0,priceList.get(lastIndex) ) ;  // assign the last value to the first
        priceList.set(lastIndex,temp) ;               // assign the saved first value into the last index

        System.out.println("priceList after swapping first and last value : \n\t " + priceList);
    }
}
