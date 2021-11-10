package day35;

public class WrapperTypePrimitiveTypeConversion {

    public static void main(String[] args) {

        Integer num1 = 100 ; // -->> auto-boxing  100 -->> new Integer(100)
        // Integer.valueOf(. .) is a method that return Integer Object
        // it has 2 overloaded version one that accept number, another accept String
        // BUT BOTH OF THEM RETURN INTEGER OBJECT
        int num2 = Integer.valueOf("200") ;  // auto-unboxing into 200

        // this can not happen buy itself
        // int num3 = "200" ;
        // This is how we can use parseInt to convert string to int
        int num3 = Integer.parseInt("200") ;

        /**
         * Integer.parseInt("numberHere")
         *    it returns an int value converted from String
         *
         * Integer.valueOf("numberHere")
         *  it returns an Integer Object by wrapping up the number
         *
         *  YOU MAY USE WHICHEVER YOU WANT BECAUSE :
         *  Autoboxing and Auto-unboxing will take care of the conversion
         */

        // Use this number IPR2012-00001 and store the year into an int variable
        // This case number always start with 3 characters either IPR, PGR, CBM, DER
        // followed by year, followed by dash and 5 digits number

//        String caseNumber = "IPR2012-00001" ;
//        int year ;                             // -- get 2012 out of it
//
//        String strYear = caseNumber.substring(3,7) ;
//        year = Integer.parseInt(strYear) ;
//        System.out.println("strYear = " + strYear);
        System.out.println(getYearOutOfCaseNumber("DER2019-00034") ) ;
        System.out.println(getYearOutOfCaseNumber("IPR2009-01042") ) ;
        System.out.println(getYearOutOfCaseNumber("CBM2001-10134") ) ;
    }

    public static int getYearOutOfCaseNumber(String caseNumber) {
        // DO VALIDATION ON CASE NUMBER
         /**
           TODO : Case number should always start with either
            CBM , IPR , PGR, DER
            FOLLOWED BY 4 DIGITS NUMBER
            FOLLOWED BY -
            AND FOLLOWED BY 5 DIGIT
         **/


//        int year ;
//        String strYear = caseNumber.substring(3,7) ;
//        year = Integer.parseInt(strYear) ;
//        return year ;
//
        return Integer.parseInt(caseNumber.substring(3,7) ) ;


    }










}
