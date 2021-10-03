package day31;

public class CallingOneMethodInsideAnother {

    public static void main(String[] args) {

         FinallyAwake() ;
         drinkCoffee();

    }
    public static void  FinallyAwake() {
        wakeUp();
        drinkCoffee();
    }

    public static void wakeUp() {

        System.out.println("Open your eye") ;
        System.out.println("Close your eye");
        System.out.println("Hear your alarm? open it again! ");
        System.out.println("=============");
    }

    public static void drinkCoffee(){
        System.out.println("Put coffee in in your coffee machine");
        System.out.println("Press the button Make your coffee");
        System.out.println("=============");
    }









}
