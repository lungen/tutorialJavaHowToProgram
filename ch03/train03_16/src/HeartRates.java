/* 3.16 (Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see that
 * your heart rate stays within a safe range suggested by your trainers and doctors. According to the Amer-
 * ican Heart Association (AHA) ( www.americanheart.org/presenter.jhtml?identifier=4736  ), the
 * formula for calculating your maximum heart rate in beats per minute is 220 minus your age in years.
 * Your target heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are
 * estimates provided by the AHA. Maximum and target heart rates may vary based on the health, fitness
 * and gender of the individual. Always consult a physician or qualified health-care professional before
 * beginning or modifying an exercise program.] 
 *
 * Create a class called HeartRates. The class attributes should include the person’s first name, last name and date of birth (consisting of separate attributes for
 * the month, day and year of birth). Your class should have a constructor that receives this data as pa-
 * rameters. For each attribute provide set and get methods. The class also should include a method that
 * calculates and returns the person’s age (in years), a method that calculates and returns the person’s
 * maximum heart rate and a method that calculates and returns the person’s target heart rate. Write a
 * Java app that prompts for the person’s information, instantiates an object of class HeartRates and
 * prints the information from that object—including the person’s first name, last name and date of
 * birth—then calculates and prints the person’s age in (years), maximum heart rate and target-heart-rate
 * range.*/

import java.util.GregorianCalendar;

public class HeartRates {
    
    GregorianCalendar calendar = new GregorianCalendar();
    // date vars
    int yearNow = calendar.get(GregorianCalendar.YEAR);

    // instances
    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;

    // constructor
    public HeartRates(String firstName, String lastName, int day, int month, int year) {

        this.firstName = firstName;
        this.lastName = lastName;

        if ((day > 0) && (day <= 31)) this.day = day;
        if ((month > 0) && (month <= 12)) this.month = month;
        if ((year > 1900) && (year <= 2017)) this.year = year;
    }

    // geters and seters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if ((day > 0) && (day <= 31)) this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if ((month > 0) && (month <= 12)) this.month = month;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if ((year > 1900) && (year <= 2017)) this.year = year;
    }

    // method that calculates and returns the person’s age (in years)
    public int getAge() 
    {
        return yearNow - this.year;
    }

    // method that calculates and returns the person’s maximum heart rate
    public double getMaximumHeartRate()
    {
        return 220 - this.getAge();
    }

    // method that calculates and returns the person’s target heart rate
    public double getTargetHeartRate()
    {
        return this.getMaximumHeartRate() * 0.5;
    }
}
