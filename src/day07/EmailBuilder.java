package day07;

import java.util.Scanner;

public class EmailBuilder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Enter your first name , last name , company seperated by space : ");

        String firstName,lastName, company, email ;
        firstName = scan.next();  //"Jiyan" ;
        lastName  = scan.next();   //"Tunc" ;
        company   = scan.next();  //"Amazon" ;
        // first name_lastName@company.com    Jiyan_Tunc@Amazon.com
        email = firstName+"_"+lastName +"@"+company+".com" ;

        System.out.println(" My name is " + firstName + " " + lastName + " and I work for " +
         company + " " + "and my email is " + email );




    }
}
