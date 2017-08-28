public class TesterTestAccount
{
    public static void main(String[] args)
    {
        TesterAccount accountA = new TesterAccount("tom", 12.3);
        TesterAccount accountB = new TesterAccount("lisa", 22.5);

        System.out.printf("%s hasd %.2f%n", accountA.getName(),
                accountA.getBalance());

        System.out.printf("%s hasd %.2f%n", accountB.getName(),
                accountB.getBalance());

        accountA.withdraw(3);
        System.out.printf("Amount has beet withdrawn: %.2f%n",
                accountA.getBalance());

        accountA.withdraw(31);
        System.out.printf("Amount has beet withdrawn: %.2f%n",
                accountA.getBalance());
    }
}
