// Exercise 2.29:
// 2.29 (Integer Value of a Character) Here’s another peek ahead. In this chapter, you learned about
// integers and the type int . Java can also represent uppercase letters, lowercase letters and a consider-
// able variety of special symbols. Every character has a corresponding integer representation. The set
// of characters a computer uses together with the corresponding integer representations for those
// characters is called that computer’s character set. You can indicate a character value in a program
// simply by enclosing that character in single quotes, as in 'A' .
// You can determine a character’s integer equivalent by preceding that character with (int) , as in
// (int) 'A'
// An operator of this form is called a cast operator. (You’ll learn about cast operators in Chapter 4.)
// The following statement outputs a character and its integer equivalent:
// System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
// When the preceding statement executes, it displays the character A and the value 65 (from the Uni-
// code ® character set) as part of the string. The format specifier %c is a placeholder for a character (in
// this case, the character 'A' ).
// Using statements similar to the one shown earlier in this exercise, write an application that dis-
// plays the integer equivalents of some uppercase letters, lowercase letters, digits and special symbols.
// Display the integer equivalents of the following: A B C a b c 0 1 2 $ * + / and the blank character.

import java.util.Scanner; // program uses class Scanner

public class IntegerValueOfCharacter
{
    public static void main(String[] args)
    {
        char[] charArray  = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/', ' '};

        for (int i = 0; i < charArray.length; i++)
        {
            System.out.printf("Character %c has the value %d%n", charArray[i], (int) charArray[i]);
        }
    } // void main
} // public class
