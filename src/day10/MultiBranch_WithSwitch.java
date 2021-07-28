package day10;

public class MultiBranch_WithSwitch {

    public static void main(String[] args) {

        // At the Mcdonald  Drive thru
        System.out.println("Welcome to Mcdonald, what can I get for you ");

        /*
         * 11, Burger
         * 5, French Fries
         * 8, Nuggets
         * 35, Ice Cream
         * 55, Coke
         */
        String order = "";
        int itemNumber = 11;
        // what data type of variable I can use here
        // byte, short, int, char, String

        switch (itemNumber) {
            case 11:
                System.out.println("You have selected 11 ");
                order = "Burger";
                break; // if break does not show up here
                       // it will just move on to next case
            case 5:
                System.out.println("You have selected 5 ");
                order = "French Fries";
                break;
            case 8:
                System.out.println("You have selected 8 ");
                order = "Nuggets";
                break;
            case 35:
                System.out.println("You have selected 35 ");
                System.out.println("YAY!!! YUM!!!");
                System.out.println("ENJOY");
                order = "Ice Cream";
                break;
            default:
                System.out.println("YOU HAVE SELECTED UNKNOWN ITEM NUMBER@!!");
                order = "Unknown";
        }
        System.out.println("Your order is " + order);

    }
}
