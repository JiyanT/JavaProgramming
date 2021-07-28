package day22;

public class CreatingArray2 {

    public static void main(String[] args) {

        int num ;        // we are only declaring a variable
            num = 10 ;   // we are assigning a value on different line
        
        // creating an array in second way

        // int[] ages = new int[]{3,5,11,33,57,18,} ;

        int[] ages ;     // we are only declaring a variable
            ages = new int[]{3,5,11,33,57,18,} ;  // we are assigning a value on different line
        
        int itemCount = ages.length ;
        System.out.println("itemCount = " + itemCount);

        System.out.println("ages = " + ages) ;

       //  System.out.println(ages[0]) ;
        for (int x = 0; x <itemCount ; x++) {

            System.out.println(ages[x]);
        }
        //  if you do it this way : IT MUST HAPPEN IN ONE LINE TOGETHER
         int[] areCodes = {703, 300, 954, 665 } ;

//        int[] areCodes ;
//        areCodes = {703, 300, 954, 665 } ;

        for (int x = 0; x < areCodes.length ; x++) {
            System.out.print(areCodes[x] + " ");


        }

        
        
        
        
        
        
        
        
        
        
    }
}
