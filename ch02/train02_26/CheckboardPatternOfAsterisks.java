// Exercise 2.27: CheckboardPatternOfAsterisks.java
// (Checkerboard Pattern of Asterisks) Write an application that displays a checkerboard pat-
// tern, as follows

import java.util.Scanner; // program uses class Scanner

public class CheckboardPatternOfAsterisks
{
    public static void main(String[] args)
    {
        String a = "* * * * * * * *";
        String b = " * * * * * * * *";

        for (int i=0; i<=3; i++) 
        {
            System.out.println(a);
            System.out.println(b);
        }
    } // void main
} // public class
