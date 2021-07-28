package day11;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class WarmUp1_LightOnOff {
    /*
    * Create class called WarmUp1_LightOnOff m
      Create a variable targetOption as String and assign one of below option for example

      You have 4 switches in your home to turn on
        Bd - bedroom
        Lr - living room
        Ki - kitchen
        Ha - Hallway

        Use switch statement to write a program to print which room light is turned on
        For example if Bd was targetOption
           the print you have turned on bedroom light
           *  */

    public static void main(String[] args) {

        // there is a targetOption that store my option
        // and it looks like it has 2 character so i use String as date type

        String targetOption = "" ;
        // what can be the data type of the variable inside switch
        // byte, short, int, char, string
        switch (targetOption){
//        Bd - bedroom
//        Lr - living room
//        Ki - kitchen
//        Ha - Hallway
            case "Bd":
                System.out.println("you have turned on bedroom light");
                break;
            case "Lr" :
                System.out.println("you have turned on Living room light");
                break;
            case "Ki":
                System.out.println("you have turned on kitchen light");
                break;
            case"Ha" :
                System.out.println("you have turned on Hallway light");
                break;
            default:
                System.out.println("WRONG OPTION");
                break;

        }


    }
}
