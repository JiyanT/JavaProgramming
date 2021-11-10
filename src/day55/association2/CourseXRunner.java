package day55.association2;

import java.util.ArrayList;
import java.util.List;

public class CourseXRunner {

    public static void main(String[] args) {

        List<Student> myList = new ArrayList<>() ;
        myList.add(new Student("Muge", 101) ) ;
        myList.add(new Student("Hasan", 102) ) ;
        myList.add(new Student("Astrit", 103) ) ;
        myList.add(new Student("Vlad", 104) ) ;
        myList.add(new Student("Zehra", 105) ) ;
        myList.add(new Student("Ayjeren", 106) ) ;

        CourseX java = new CourseX("HAS-A",myList) ;

        java.addStudent("Goksel", 110);
        java.addStudent(new Student("Dilshat",111) ) ;

        System.out.println("java = " + java);

    }
}
