public class EmployeeTest
{
    public static void main(String[] args){

        Employee emp1 = new Employee("tom", "turbo", 1000);
        Employee emp2 = new Employee("donald", "trump", 2000);
        
        System.out.printf("%s %s (%.2f) Year: %.2f%n",
                    emp1.getFirstName(),
                    emp1.getLastName(),
                    emp1.getSalary(),
                    emp1.showYearlySalary()
        );

        emp1.raiseSalary(10);

        System.out.printf("%s %s (%.2f) Year: %.2f%n",
                    emp1.getFirstName(),
                    emp1.getLastName(),
                    emp1.getSalary(),
                    emp1.showYearlySalary()
        );

        System.out.printf("%s %s (%.2f) Year: %.2f%n",
                    emp2.getFirstName(),
                    emp2.getLastName(),
                    emp2.getSalary(),
                    emp2.showYearlySalary()
        );

        emp2.raiseSalary(10);

        System.out.printf("%s %s (%.2f) Year: %.2f%n",
                    emp2.getFirstName(),
                    emp2.getLastName(),
                    emp2.getSalary(),
                    emp2.showYearlySalary()
        );
    }
}
