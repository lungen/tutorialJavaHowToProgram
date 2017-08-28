// Exercise 2.25: OddOrEven.java
// (Odd or Even) Write an application that reads an integer and determines and prints wheth-
// er it’s odd or even. [Hint: Use the remainder operator. An even number is a multiple of 2. Any mul-
// tiple of 2 leaves a remainder of 0 when divided by 2]

import java.util.Scanner; // program uses class Scanner

public class OddOrEven
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num1;

        System.out.print("enter number: ");
        num1 = input.nextInt();

        if (num1 % 2 != 0)
            // odd
            System.out.printf("%d is odd.%n", num1);

        if (num1 % 2 == 0)
            //even
            System.out.printf("%d is even.%n", num1);
    }

}
