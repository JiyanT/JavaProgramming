package day47;

public class ElectricCar extends Car {

    int batteryLevel ;

    @Override
    public void start() {
        System.out.println("This is how electric car start");
    }

    @Override
    public void goForward() {
        System.out.println("GOING FORWARD");
    }

    @Override
    public void goBackWard() {
        System.out.println("GOING BACKWARD");
    }

    @Override
    public void turn(String direction) {
        System.out.println("TURNING " + direction);
    }


}
