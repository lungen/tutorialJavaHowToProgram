// Exercise 2.30:
// 2.30 (Separating the Digits in an Integer) Write an application that inputs one number consist-
// ing of five digits from the user, separates the number into its individual digits and prints the digits
// separated from one another by three spaces each. For example, if the user types in the number 42339 ,
// the program should print 4 2 3 3 9.
// Assume that the user enters the correct number of digits. What happens when you enter a
// number with more than five digits? What happens when you enter a number with fewer than five
// digits? [Hint: It’s possible to do this exercise with the techniques you learned in this chapter. You’ll
// need to use both division and remainder operations to “pick off ” each digit.]
import java.util.Scanner; // program uses class Scanner

public class SeperatingTheDigits
{
    public static void main(String[] args)
    {
        String n; 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number of five digits length: ");
        n = input.next();
        System.out.printf("> %s%n", n);

        for (int i = 0; i < n.length(); i++) 
        {
            System.out.print(n.charAt(i) + " ");
        }

    } // void main
} // public class
