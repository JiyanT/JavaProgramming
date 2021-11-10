package day51.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeTest {

    public static void main(String[] args) {

        Shape s1 = new Triangle() ;
        Shape s2 = new Rectangle() ;
        Shape s3 = new Circle() ;

//        s1.draw();
//        s2.draw();
//        s3.draw();

        Shape[] allShapes = {s1, s2, s3, new Triangle(), s2, s1, s1} ;
        for (Shape each: allShapes) {
            each.draw();
        }
        System.out.println("===========For Loop============");

        for (int x = 0; x < allShapes.length ; x++) {
            allShapes[x].draw();
        }
        System.out.println("===========For each with List============");

        // Quick way to create a List  --->> CAN WE ADD OR REMOVE ITEM FROM THIS SHORT WAY ? NO !!!
        //List<Shape> shapeList = Arrays.asList(s1, s2, s3, s2, s1);
        // this is a regular Arraylist object we can do anything with

        List<Shape> shapeList = new ArrayList<>() ;
        for (Shape each : shapeList) {
            each.draw();
        }
        System.out.println("===========For Loop with List============");
        for (int x = 0; x < shapeList.size() ; x++) {
            shapeList.get(x).draw() ;

        }

        // please create Array of shape to store
        // 5 concrete Shape Object
        // and call the draw the method on each of them

        // Also try to create ArrayList of Shape
        // and store 4 concrete Shape objects
        // and call the draw method on each of them


        // Create a different class with main method:
        // and try to use the Shape, Circle, Triangle class from day 50
        // Create list of Shape and calculate their area



    }
}
