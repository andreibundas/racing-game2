package Chpt2InputProcessingandOutpu;

import java.util.Scanner;

public class CountingNrCharacters {

    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the input string ? ");

        String input1 = input.next();
        System.out.println(input1 + " has " + input1.length() + " characters");
    }

}
