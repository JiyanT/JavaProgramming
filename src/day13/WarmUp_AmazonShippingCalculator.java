package day13;

public class WarmUp_AmazonShippingCalculator {

    public static void main(String[] args) {

        /*
         * Amazon has 2 types of user one is Prime member and another is regular member
         * Prime member get free shipping in all purchase no matter the amount
         * Regular member user get free shipping only if their purchase is more than 25$
         * Otherwise they get 5$ shipping fee
         */

        String memberType = " member";
        double amount = 45.99d;
        int shippingFee =0 ;

        // First I wanna check it's prime member or not

        if (memberType.equalsIgnoreCase("PRIME MEMBER")) {
            System.out.println("YOU GET 1 DAY FREE SHIPPING");
            System.out.println("Your final price is " + amount);

        } else if ( amount> 25 ){
        //}else if (! memberType.equalsIgnoreCase("PRIME MEMBER" ) && amount > 25) {

    System.out.println("NOT A PRIME MEMBER BUT YOUR ORDER IS MORE THAN 25 ");
            System.out.println("YOU GOT FREE SHIPPING ON AMOUNT " + amount );
        }else {
            System.out.println("DO YOU WANNA SIGN UP FOR PRIME MEMBERSHIP?");
            shippingFee = 5 ;
            amount = amount + shippingFee ;  // amount += shippingFee
            System.out.println("YOUR FINAL AMOUNT IS " + amount );
        }


        }



     }