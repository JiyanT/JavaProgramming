package day13;

public class NestedIf_DoYouWannaShop {

    public static void main(String[] args) {

        // Create a boolean for store the result of YouWantToShop
        // If yes , do you want to go to store or do you wanna shop online

        // If user do not wanna shop at all , print good job stay home coding !!!

        boolean YouWantToShop = true ;
        String preference = "Online";

        // if(YouWantToShop)

        if (YouWantToShop == true) {

            if (preference.equals("Store") ){
                System.out.println("GOING TO STORE FOR SHOPPING");
            } else {
                System.out.println("GOING TO ONLINE FOR SHOPPING ");
            }


        } else {
            System.out.println("good job stay home coding!!!");
        }

    }
     }