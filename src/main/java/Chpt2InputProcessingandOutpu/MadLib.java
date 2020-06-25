package Chpt2InputProcessingandOutpu;

import java.util.Scanner;

public class MadLib {

    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = input.next();
        System.out.print("Enter a verb: ");
        String verb = input2.next();
        System.out.print("Enter an adjective: ");
        String adjective = input3.next();
        System.out.print("Enter an adverb: ");
        String adverb = input4.next();

        System.out.println("Are you " + verb + " with your " + adjective + " " + noun + " " + adverb + " ?");

    }
}
