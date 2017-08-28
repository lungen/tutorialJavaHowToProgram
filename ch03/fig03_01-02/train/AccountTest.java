// Train AccountTest.java
// 
//      . ask for username
//      . show Account.name
//      . set Account.name

// import scanner
import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();

        System.out.println("Please enter your name:");
        String aUserName = input.nextLine();

        System.out.printf("account user-name: %s%n", myAccount.getName());
        myAccount.setName(aUserName);
        System.out.printf("account user-name: %s%n", myAccount.getName());
    }

}
