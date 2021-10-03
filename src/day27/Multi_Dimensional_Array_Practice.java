package day27;

public class Multi_Dimensional_Array_Practice {

    public static void main(String[] args) {


        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide" } ;
        String[] testersTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan" } ;
        String [] businessAnalyistsTeam = {"Lisa", "Ershad", "Naila"} ;

        String [][] scrumTeam = { developersTeam , testersTeam , businessAnalyistsTeam } ;

        int maxLength = scrumTeam[0][0].length() ;
        String longestString = "" ;    // to store the longest String

        for ( String [] each1DArray : scrumTeam ) {

            for (String eachElement : each1DArray) {
                if (maxLength < eachElement.length()) {    // to compare which string has the largest length
                    maxLength = eachElement.length();  // to assign maximum String length 
                    longestString = eachElement ;  // if the String has the largest length, we assign that
                                                  // String to longestString
                }
            }
        }
        System.out.println(maxLength);
        System.out.println(longestString);

        System.out.println("===========================");

        for ( String [] each1DArray : scrumTeam ) {

            for (String eachElement : each1DArray) {
                if (maxLength == eachElement.length()) {
                    System.out.println(eachElement);
                }
            }
        }







    }
}
