package lektion22;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        System.out.println("Enter cpr");

        Scanner scan = new Scanner(System.in);
        String cpr = scan.nextLine();


        System.out.println("Welcome!");
        System.out.println("1. getBMI ");
        System.out.println("2. getTextualBMI");
        System.out.println("3. getName");
        Funktionalitet funk = new Funktionalitet();

        System.out.println(funk.getBMI(cpr));
        System.out.println(funk.getTextualBMI(cpr));
        System.out.println(funk.getNavn(cpr));


    }
}
