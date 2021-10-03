package day29;

public class HeroIdentity_JusticeLeage {

    public static void main(String[] args) {

       String[] allHereos = { "Superman-Clark Kent",
               "Batman-Bruce Wayne",
               "Wonder Woman-Princess Diana",
               "Aquaman-Arthur Orin Curry",
               "Wonder Woman-Princess Diana",
               "Cyborg-Victor Stone",
               "The Flash-Barry Allen ",
               "Green Lantern-Hal Jordan",
               "Green Arrow-Oliver Queen",
               "Atom-Ray Palmer",
               "Hawkman-Carter Hall",
               "Hawker-Shira Hall",
               "Zantana-Santana Zatara",
               "Martian Manhunt-John Jones"} ;
       
       for ( String eachHero: allHereos) {
          // System.out.println("eachHero = " + eachHero);

           // assume this can be different hero
           String hero = eachHero ;
           // hide this hero identity
           // String heroX = "Superman -*********** " ;


           String[] heroSplitted = hero.split("-") ;
           String heroCode = heroSplitted[0] ;
           String fullName = heroSplitted[1] ;

           String stars = "" ;
           for (int i = 1; i <hero.split("-")[1].length(); i++) {
               stars += "*";
           }


           String heroX = hero.replace(fullName,stars) ;
           System.out.println("hero = " + hero);
           System.out.println("heroX = " + heroX) ;

       }
       
       

      




    }
}
