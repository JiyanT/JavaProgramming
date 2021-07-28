package day09;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class LanguagePicker {

    public static void main(String[] args) {

        System.out.println("Welcome to Cybertek Call Center ");

        System.out.println(" Please select your language option from 1-7 ");

        int languageOption = 1;
        String greeting = "";
        // TURN THIS CODE INTO SWITCH STATEMENT !!!!!

        if (languageOption == 1) {
            greeting = "Salam";
        } else if (languageOption == 2) {
            greeting = "Hello";
        } else if (languageOption == 3) {
            greeting = "Privet";
        } else if (languageOption == 4) {
            greeting = "Szia";
        } else if (languageOption == 5) {
            greeting = "Merhaba";
        } else if (languageOption == 6) {
            greeting = "Hola";

        } else if (languageOption == 7) {
            greeting = "Bonjour";

        } else {
            greeting = "UnKnown";
        }
        // Hello, SDET
        greeting = greeting + ", SDET ";

        System.out.println("This is how greeting message you get :" + greeting);

    }

    }
