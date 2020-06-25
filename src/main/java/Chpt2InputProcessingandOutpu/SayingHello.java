package Chpt2InputProcessingandOutpu;

import java.util.Scanner;

public class SayingHello {

    public static void main( String[] args )   {

        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String myString = input.next();
        System.out.println("Hello " + myString + ", nice to meet you! ");

    }
}
