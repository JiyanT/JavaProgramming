package day50;

import java.util.Arrays ;
import java.util.List ;

public class MathTest<q3> {

    public static void main(String[] args) {

        Addition q1 = new Addition(10, 90);
        System.out.println("q1 before calculate : " + q1);
        q1.calculate();
        System.out.println("q1 after calculate: " + q1);
        // The question type is Addition :  10+90 =

        Subtraction q2 = new Subtraction(90, 10);
        System.out.println("q2 before calculate : " + q2);
        q2.calculate();
        System.out.println("q2 after calculate: " + q2);


        Subtraction q3 = new Subtraction(10, 90);
        System.out.println("q3 before calculate : " + q3);
        q3.calculate();
        System.out.println("q3 after calculate: " + q3);

        Multiplication q4 = new Multiplication(10,3) ;
        System.out.println("q4 before calculate : " + q4);
        q4.calculate();
        System.out.println("q4 after calculate: " + q4);

        Division q5 = new Division(10,5) ;
        System.out.println("q5 before calculate : " + q5);
        q5.calculate() ;
        System.out.println("q5 after calculate : " + q5);

        Division q6 = new Division(10,50) ;
        System.out.println("q7 before calculate : " + q6);
        q6.calculate() ;
        System.out.println("q7 after calculate : " + q6);

        Division q7 = new Division(10,0) ;
        System.out.println("q7 before calculate : " + q7);
        q7.calculate() ;
        System.out.println("q7 after calculate : " + q7);

        System.out.println("======================");

        List<Question> allTestQuestions = Arrays.asList(q1,q2,q3,q4,q5,q6,q7) ;
        for (Question eachQ : allTestQuestions ) {
            System.out.println("eachQ  = " + eachQ );
        }

    }
}
