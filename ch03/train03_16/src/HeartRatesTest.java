/* Write a
 * Java app that prompts for the person’s information, instantiates an object of class HeartRates and
 * prints the information from that object—including the person’s first name, last name and date of
 * birth—then calculates and prints the person’s age in (years), maximum heart rate and target-heart-rate
 * range. */
import java.util.Scanner;

public class HeartRatesTest {

    public static void main(String[] args) {

        // objects
        Scanner input = new Scanner(System.in);

        // user input
        String firstName;
        String lastName;
        int day;
        int month;
        int year;


        System.out.println("Enter your first name: ");
        firstName = input.nextLine();

        System.out.println("Enter your last name: ");
        lastName = input.nextLine();

        System.out.println("Enter your birth day (day only): ");
        day = input.nextInt();
            
        System.out.println("Enter your birth month: ");
        month = input.nextInt();
        
        System.out.println("Enter your birth year: ");
        year = input.nextInt();
        input.close();

        //System.out.printf("your entered: %n");
        //System.out.printf("name: %s %s%n", firstName, lastName);
        //System.out.printf("birth date: %d %d %d %n", day, month, year);
        //System.out.printf("Year now: %d", yearNow);
        //System.out.printf("Your age: %d", (yearNow - year));
        
        HeartRates person = new HeartRates(firstName, lastName, day, month, year);

        System.out.println("-----------------------------");
        System.out.printf("name: %s %s%n", person.getFirstName(), person.getLastName());
        System.out.printf("birth-date: %d %d %d. Age: %d%n", person.getDay(), person.getMonth(), 
                person.getYear(), person.getAge());
        System.out.printf("maximum heart-rate: %.2f%n", person.getMaximumHeartRate());
        System.out.printf("target heart-rate: %.2f%n", person.getTargetHeartRate());
    }

}
