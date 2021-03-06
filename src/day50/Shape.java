package day50;

    /*
* Task 2
		Create an Interface called Drawable
				it has draw method
		Create an abstract class called Shape
		it implements Drawable interface
		it has 2 fields :  String name , double area
		abstract method calculateArea();
		Create 2 concrete Shape classes called
				Square
					field : length
					instance methods : (implement all abstract methods)
					toString method
				Circle
					field : radius
					instance methods : (implement all abstract methods)
					toString method
* */
// abstract class is not required to implement
// inherited abstract methods of the interface
    public abstract class Shape implements Drawable  {
        String name ;
        double area ;

        // why abstract class have constructor even we can not use it to create an object ?
        // it exists purely to let subclass call and reuse the functionality in subclass constructor
        public Shape(String name) {
            this.name = name;

        }

        public abstract void calculateArea() ;
       // public abstract void draw() ;
    }
