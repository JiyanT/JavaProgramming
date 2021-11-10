package day53;

public abstract class Fruit {

    String taste ;
    String color ;

    public Fruit(String taste, String color) {
        this.taste = taste;
        this.color = color;
    }

    public abstract void getDigest() ;

    @Override
    public String toString() {
        return "HELLO FROM FRUIT" ;
    }
}
