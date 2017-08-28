// Excercie 3.1
// + Add GUI
// Addition program that displays the sum of two numbers.

import javax.swing.JOptionPane;

public class GuiAddition
{
   // main method begins execution of Java application
   public static void main(String[] args)
   {
       // prompt
       String num1 = JOptionPane.showInputDialog("enter first number: ");
       String num2 = JOptionPane.showInputDialog("enter second number: ");
       int number1 = Integer.parseInt(num1);
       int number2 = Integer.parseInt(num2);
       int sum = number1 + number2; // add numbers, then store total in sum

       // create the message
       String message = String.format("Sum:, %d", sum);

       // display the message
       JOptionPane.showMessageDialog(null, message);

   } // end method main
} // end class Addition
