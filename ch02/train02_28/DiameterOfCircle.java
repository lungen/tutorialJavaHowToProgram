// Exercise 2.28: DiameterOfCircle.java
// (Checkerboard Pattern of Asterisks) Write an application that displays a checkerboard pat-
// tern, as follows

import java.util.Scanner; // program uses class Scanner

public class DiameterOfCircle
{
    public static void main(String[] args)
    {
        int r = 0;
        Scanner input = new Scanner(System.in);

        // System.out.print(Math.PI);
        System.out.print("Enter radius (integer): ");
        r = input.nextInt();
        
        System.out.printf("Diameter: %f%n", 2 * Math.PI);
        System.out.printf("Circumference: %f%n", 2 * Math.PI * r);
        System.out.printf("Area: %f%n", Math.PI * (r * r));

    } // void main
} // public class
