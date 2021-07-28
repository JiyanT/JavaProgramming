package day10;

public class SeasonAction {

    public static void main(String[] args) {

        /*
        * What do you do in each season
        *
        * Spring --->>> Hike ! Easter , Newroz , Blossom
        * Summer --->>> Swim , Vacation , BBQ , Holiday
        * Fall   --->>> Black Friday , Hiking , Harvest , Halloween , Shopping
        * Winter --->>> Snowboarding ,Ski , Christmas , New Year
        *
         */

        String season = " Summer ";
        // byte, short, int, char, string

        switch (season){
            case "Spring" :
                System.out.println("Hike ! Easter , Newroz , Blossom");
                break;
            case "Summer"  :
                System.out.println("Swim , Vacation , BBQ , Holiday");
                break;
            case " Fall" :
                System.out.println("Black Friday , Hiking , Harvest , Halloween , Shopping");
                break;
            case " Winter" :
                System.out.println("Snowboarding ,Ski , Christmas , New Year");
                break;
            default:
                System.out.println("unknown");

        }
    }
}
