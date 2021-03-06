package day53;

public class FruitShop {
    // Only Reference Type Decide what you can access at compile time
    // if we have Fruit as reference type, getDigested method will point to the one under Fruit class
    // Actual object type decide what method will be called at run time
    // since actual object is Apple|Orange, at run time it will call overridden version of the method
    // and that's the power of polymorphism, making the correct decision at runtime according to the actual object
    public static void main(String[] args) {

        Apple a1 = new Apple("sweet", "red", "Fuji") ;
        // what can I access using reference variable a1,
        // a1 has Apple as reference type , so we can access anything inside apple
        System.out.println("a1.taste = " + a1.taste);
        System.out.println("a1.color = " + a1.color);
        System.out.println("a1.type = " + a1.type);

        a1.getDigest();

        System.out.println("============================");
        Fruit f1 = a1 ; // new Apple("sweet", "red", "Fuji") ;
        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);
        // f1.type  // we can not access type coming from apple if we refer it as Fruit
        // if Fruit does not have getDigested method
        // below will not compile
        // because only reference type decide what you can access
        f1.getDigest() ; // new Apple("sweet", "red", "Fuji") ; .getDigested()
       f1 = new Orange("sour-sweet", "radish", 11) ;
       f1.getDigest();

        System.out.println(f1.toString()) ;



//        String str = null ;
//        System.out.println(str.charAt(0) ) ;
//        System.out.println(str.bark() ) ;
//        System.out.println(str.getDigest() ) ;


        // Fruit is reference type , Apple is actual object Type
        Fruit f2 = new Apple("crispy", "hot red", "Gala") ;
        Fruit f3 = new Orange("sour", "orange", 12) ;
        Fruit f4 = new Orange("very sweet", "Blood red", 10) ;


    }
}
