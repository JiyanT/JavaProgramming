package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManyFruits {

    public static void main(String[] args) {

        Apple a1 = new Apple("sweet", "red", "Fuji");
        Fruit f1 = a1;
        f1 = new Orange("sour-sweet", "radish", 11);
        Fruit f2 = new Apple("crispy", "hot red", "Gala");
        Fruit f3 = new Orange("sour", "orange", 12);
        Fruit f4 = new Orange("very sweet", "Blood red", 10);

        Fruit[] myFruits = {f1, f2, f3, f4};
        for (Fruit each : myFruits) {
            each.getDigest();
        }

        System.out.println("====================================");
        // in this way , it's not resizable | adding removing will not work | everything else work
        // List<Fruit> fruitList = Arrays.asList(f1,f2,f3,f4) ;
        
        // this is a just a regular list with 4 item pre-filled
        List<Fruit> fruitList = new ArrayList<>(Arrays.asList(f1, f2, f3, f4) ) ;
        
        for (Fruit each : fruitList) {
            System.out.println("each.toString() = " + each.toString() ) ;
            System.out.println("Class Type : " + each.getClass().getSimpleName() );
        }
    }
}