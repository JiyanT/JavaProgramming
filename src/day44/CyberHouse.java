package day44;

public class CyberHouse {

    String design ;
    int houseNum ;
    // we can change default value of the fields
    // by assigning value directly in the template class
   private static String neighbourhoodName ="Cybertek Ave";

    // constructor  can access anything
    public CyberHouse(String design, int houseNum) {
        this.design = design;
        this.houseNum = houseNum;
    }

    // instance method can access anything
    public void showAllInfo(){
        System.out.println("House : " + this.houseNum +
                ", design: " + this.design +
                ", neighbourhoodName : " + neighbourhoodName);
    }
    // static method can only access static members of same class
    public static void showNeighbourhoodName() {
        System.out.println("neighbourhoodName = " + neighbourhoodName);
        // CAN NOT ACCESS ANYTHING NON-STATIC INSIDE STATIC METHODS
        // System.out.println("houseNum = " + houseNum);
    }
}
