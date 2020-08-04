

//Written by Kurtis Yoder
//This program compares the first and last characters of a string

import java.util.Scanner;

public class CharCompare1 
{
    public static void main(String[] args)
    {
        //Prompt user
        System.out.print("Enter a string to compare the first and " +
                         "last characters of a string. ");
        Scanner keyboard = new Scanner(System.in);
        String string;
        //Get the string from the user
        string = keyboard.nextLine();
        //Change the string to lower case
        String littleString = string.toLowerCase();
        //Get the first and last characters of the string into
        //a variable
        char first = littleString.charAt(0);
        char last = littleString.charAt(littleString.length()-1);
        //The rest of the program is comparing the first
        //and last characters of the string
        if (first < last)
        {
            System.out.print("In the alphabet the first character occurs" +
                             " before the last character.\n");
        }
        else if (last < first)
        {
            System.out.print("In the alphabet the last character occurs" +
                             " before the first character\n");
        }
        else
        {
            System.out.println("The first character is the same" +
                               " as the last character.");
        }
        if (first == 'a' || first == 'e' || first == 'i'
                       || first == 'o' || first == 'u' )
        {
            System.out.println("The first character is a vowel");
        }
        else
        {
            System.out.println("The first character is a consonant");
        }
        if (first <= 'm' && first >= 'a')
        {
            System.out.print("The first character appears in the first half" +
                             " of the alphabet\n");
        }
        else
        {
            System.out.print("The first character appears in the last half" +
                             " of the alphabet\n");
        }
        if (last == 'a' || last == 'e' || last == 'i'
                      || last == 'o' || last == 'u' )
        {
            System.out.println("The last character is a vowel");
        }
        else
        {
            System.out.println("The last character is a consonant");
        }
        if (last <= 'm' && last >= 'a')
        {
            System.out.print("The last character appears in the first half" +
                             " of the alphabet\n");
        }
        else
        {
            System.out.print("The last character appears in the last half" +
                             " of the alphabet\n");
        }
        
        keyboard.close();
    }
}