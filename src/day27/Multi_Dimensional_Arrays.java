package day27;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class Multi_Dimensional_Arrays {

    public static void main(String[] args) {
        /*
        Single dimensional array :
          int[] arr =
        Multi-dimensional array : an Array that can contain array(s)
        N dimensional Array MUST contains (N-1) dimensional arrays

        EX: 2 dimensional array : contains 1 dimensional arrays
          int[] [] arr2D = { {1,2,3} , {4,5,6}  }

         */
         int[] arr1D = {1, 2, 3, } ;
         // [index num of elements]
         // arr1D[1] ==> 2

        System.out.println( Arrays.toString(arr1D) ) ;


         // 2D array : is an array that contains single dimensional arrays
         //                 0 1 2     0 1 2
        int[] [] arr2D = { {1,2,3} , {4,5,6}  } ;
        // index :           0          1

        // [INDEX NUM OF 1D ARRAYS] [ INDEX NUM OF ELEMENTS ]

        // arr2D[0] ==> {1,2,3}

        System.out.println(arr2D.length ) ;
        System.out.println(Arrays.toString(arr2D[0]) ) ;
        System.out.println(Arrays.toString(arr2D[1]) ) ;

        // arr2D[0][2] ==> 3
        System.out.println( arr2D[0] [2] ) ; // returns int value

        // print 5 : arr2D[1][1]
        System.out.println( arr2D[1][1] ) ;   // returns int value


        // System.out.println(Arrays.toString(arr2D) ) ;  // Arrays.toString is only applicable for single array

        // Arrays.deepToString ( multi-D Arrays ) :
        System.out.println(Arrays.deepToString(arr2D) ) ;








    }
}
