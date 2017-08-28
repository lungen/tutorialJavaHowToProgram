/* 3.13 ( Employee Class ) Create a class called Employee that includes three instance variables—a
 * first name (type String ), a last name (type String ) and a monthly salary ( double  ). Provide a con-
 * structor that initializes the three instance variables. Provide a set and a get method for each instance
 * variable. If the monthly salary is not positive, do not set its value. Write a test app named Employ-
 * eeTest that demonstrates class Employee ’s capabilities. Create two Employee objects and display each
 * object’s yearly salary. Then give each Employee a 10% raise and display each Employee ’s yearly salary
 * again.*/

public class Employee
{
    private String firstName;
    private String lastName;
    private double salary;

    /**
     *
     */
    public Employee(String firstName, String lastName, double salary) {

        this.firstName = firstName;
        this.lastName = lastName;
        if (salary > 0.0)
            this.salary = salary;
        
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        if (salary > 0.0)
            this.salary = salary;
    }

    public double showYearlySalary()
    {
        return this.salary * 12;
    }

    public void raiseSalary(int percent)
    {
        if (percent > 0)
            this.salary =  this.salary + (this.salary / 100) * percent;
    }
}
