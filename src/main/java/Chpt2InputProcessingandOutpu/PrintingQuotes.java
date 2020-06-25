package Chpt2InputProcessingandOutpu;

import java.util.Scanner;

public class PrintingQuotes {

    public static void main( String[] args )    {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String quote = input.next();
        System.out.print("Who said it? ");
        String author = input2.next();
        System.out.println(author + " says, " + quote );

    }

}
