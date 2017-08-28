// Exercise 2.32:
//(Negative, Positive and Zero Values) Write a program that inputs five numbers and deter-
//mines and prints the number of negative numbers input, the number of positive numbers input and
//the number of zeros input.

import java.util.Scanner; // program uses class Scanner

public class NegativePositiveAndZeroValues
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int n = 0;

        while (i < 10)
        {
            // System.out.println(i);
            System.out.println("Enter number (max. 10 loops)");
            n = input.nextInt();

            if (n < 0)
                System.out.println("negative");
            if (n > 0)
                System.out.println("positive");
            if (n == 0)
                System.out.println("zero");

            i = i + 1;
        }

    } // void main
} // public class
