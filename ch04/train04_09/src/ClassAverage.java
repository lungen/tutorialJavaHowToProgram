/* Initialize total to zero
 * Initialize counter to zero
 *
 * Prompt the user to enter the first grade
 * Input the first grade (possibly the sentinel)
 *
 * While the user has not yet entered the sentinel
    * Add this grade into the running total
    * Add one to the grade counter
    * Prompt the user to enter the next grade
    * Input the next grade (possibly the sentinel)
    *
 * If the counter is not equal to zero
    * Set the average to the total divided by the counter
    * Print the average
 * else
    * Print “No grades were entered” */

import java.util.Scanner;

public class ClassAverage
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // instance variables
        int total = 0;
        int counter = 0;

        System.out.print("Enter the first grade: (1 = finish)");
        int grade = input.nextInt();

        while (grade != 1)
        {
            total = total + grade;
            counter = counter + 1;
            System.out.println("Enter grade: (1 = finish)");
            grade = input.nextInt();
        } 

        input.close();

        if (counter != 0)
        {
            double average = (double) (total / counter);
            System.out.printf("Average: %f%n", average);
            System.out.printf("grades enterd: %d%n", counter);
            System.out.printf("total: %d%n", total);
        } 
        else
        {
            System.out.println("no grades were entered!");
        }
    }
}
