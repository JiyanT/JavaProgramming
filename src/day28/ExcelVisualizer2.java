package day28;

import java.util.Arrays;

public class ExcelVisualizer2 {

    public static void main(String[] args) {

        int[][] myExcel = {       // this is the beginning of the 2D Array object
                          { 10, 27, 88, 99 }, // index 0 : this is first 1D Array
                          { 87, 100 },        // index 1 : this is second 1D Array
                          { 90, 45, 65 }      // index 2 : this is third 1D Array
                          } ;         // this is the ending of the 2D Array object

        // What does deepToString method do:
        // It takes an MultiD Array and turn it a String with all items
        // What external data do we provide
        // The multiD Array object or the MultiD array variable
        // What do I get out of it ---->> String representation of MultiD array object
        System.out.println(Arrays.deepToString( myExcel ) ) ;


        for ( int[] eachRow : myExcel  ) {
            for ( int eachCell : eachRow  ){

                System.out.print(eachCell + " " ) ;
            }
            System.out.println();
        }














    }
}
