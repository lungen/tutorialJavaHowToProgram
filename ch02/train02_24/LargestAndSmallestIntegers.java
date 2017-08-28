// Exercise 2.24: LargestAndSmallestIntegers.java
// (Largest and Smallest Integers) Write an application that reads five integers and determines
// and prints the largest and smallest integers in the group. Use only the programming techniques you
// learned in this chapter.

// eclim only
import java.util.Scanner; // program uses class Scanner

public class LargestAndSmallestIntegers 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num1,
            num2,
            num3,
            num4,
            num5,
            // smallest number
            smNr = 0 ,
            // biggest number
            bgNr = 0;

        System.out.println("first number: ");
        num1 = input.nextInt();

        System.out.println("second number: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            bgNr = num1;
            smNr = num2;
        }

        if (num2 > num1) {
            bgNr = num2;
            smNr = num1;
        }

        if (num2 == num1) {
            bgNr = num2;
            smNr = num2;
        }
        System.out.printf("smallest number: %d. Biggest number: %d%n", smNr, bgNr);

        // third number
        System.out.println("third number: ");
        num3 = input.nextInt();

        if (num3 > bgNr)
            bgNr = num3;

        if (num3 < smNr)
            smNr = num3;

        System.out.printf("smallest number: %d. Biggest number: %d%n", smNr, bgNr);

        // fourth number
        System.out.println("fourth number: ");
        num4 = input.nextInt();

        if (num4 > bgNr)
            bgNr = num4;

        if (num4 < smNr)
            smNr = num4;

        System.out.printf("smallest number: %d. Biggest number: %d%n", smNr, bgNr);

        // fifth number
        System.out.println("fifth number: ");
        num5 = input.nextInt();

        if (num5 > bgNr)
            bgNr = num5;

        if (num5 < smNr)
            smNr = num5;

        System.out.printf("smallest number: %d. Biggest number: %d%n", smNr, bgNr);
    }

}
