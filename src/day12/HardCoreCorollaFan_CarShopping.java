package day12;

public class HardCoreCorollaFan_CarShopping {

    public static void main(String[] args) {

        // Buy Corolla or Tesla (DOES NOT MATTER WHATS YOUR BUDGET)
        // or
        // Tesla (only if it's within the budget THIS CONDITION ONLY APPLY FOR TESLA )

        // there is only one car covered with cloth
        // we don't know what car is it and what is the price
        // once we take out the cloth
        // we check whether its toyota , if it's we buy it without checking the price
        // if it's not we check it it's a Tesla and also check whether it is within the budget

        String carBrand = "Corolla";
        int carPrice = 60000;
        int budget = 60000;

        //  if (carBrand.equals("corolla") || carBrand.equals("tesla") && carPrice <= budget){
        //    System.out.println("CAR ACQUIRED");
        //  }else{
        // System.out.println("NOT WHAT I AM LOOKING FOR"); }

       if (carBrand.equals("Corolla") ){
           System.out.println(" COROLLA CAR ACQUIRED !!");
       }else if (carBrand.equals("Tesla") && carPrice<=budget) {
           System.out.println("TESLA CAR ACQUIRED !!");
       }else {
           System.out.println(" NOT WHAT I AM LOOKING FOR ");
       }
    }
}
