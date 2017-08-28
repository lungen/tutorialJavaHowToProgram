// Exercise 2.31:
// 2.31 (Table of Squares and Cubes) Using only the programming techniques you learned in this
// chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and
// prints the resulting values in table format, as shown below:
// number   square  tube
// 0        0       0
// 1        1       1
// 2        4       8
// 3        9       27
// 4        16      64
// ...
// 10       100     1000

import java.util.Scanner; // program uses class Scanner

public class TableOfSquaresAndTubes
{
    public static void main(String[] args)
    {
        int n = 0;

        System.out.println("number       square      cube");
        for (int i = 0; i <= 10; i++)
        {
            System.out.printf("%d       %d      %d%n", i, (i * i), (i * i * i));
        }

    } // void main
} // public class
