package day27;

public class Multi_Dimensional_Array_Practice2 {

    public static void main(String[] args) {


        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide" } ;
        String[] testersTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan" } ;
        String [] businessAnalyistsTeam = {"Lisa", "Ershad", "Naila"} ;

        String [][] scrumTeam = { developersTeam , testersTeam , businessAnalyistsTeam } ;

       // find the shortest String of text

        int minLength = scrumTeam[0][0].length() ;
        String shortestString = scrumTeam[0][0] ;

        for (int i = 0; i < scrumTeam.length ; i++) {
            for (int j=0 ; j<scrumTeam[i].length; j++) {
                if (minLength > scrumTeam[i][j].length() ) {
                    minLength=scrumTeam[i][j].length() ;
                    shortestString = scrumTeam[i][j] ;
                }
            }
        }
        System.out.println(minLength) ;
        System.out.println(shortestString) ;







    }
}
