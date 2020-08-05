
import java.util.Scanner;
import java.io.*;

/**
 * Written by Kurtis Yoder.
 * This program will ask the user for a max number then find the
 * prime numbers from 1 up until that max value.
 * This will then be outputted to a file.
 */

public class Primes1 
{
    public static void main(String[] args) throws IOException
    {
        //Intialize variable
        int dividend = 0;
       
        //Display intro
        displayMessage();
        
        //Prompt user for maxValue
        System.out.println("Enter the max number you wish to be used: ");
        
        //Get input from user
        Scanner keyboard = new Scanner(System.in);
        int maxValue = keyboard.nextInt();
        
        //Validate maxValue is greater than 10
        while (maxValue<10)
        {
            System.out.println("The number you entered is not valid." +
                               " Please enter an integer greater than 10: ");
            maxValue = keyboard.nextInt();
        }
        keyboard.close();
        
        //Create output file
        PrintWriter outputFile = new PrintWriter ("primes.txt");
        
        /*Add 1 because it will always be included in the set of prime numbers
         * and the method used doesn't catch 1 as a prime number
         */
        outputFile.println("1");
        
        //Finding the prime numbers and output to a file
        for (dividend = 1; dividend <= maxValue; dividend++)
        {    
            if (primeFind(dividend) == true)
            {
                outputFile.println(dividend);
            }
        }
        outputFile.close();
        
        //Tell the user the program has concluded
        System.out.print("The program has found the prime numbers" +
                         " within the span of numbers from 1 to the" + 
                         " value given. The prime numbers are outputted" +
                         " to primes.txt");
    }


    /**
     * This method displays a message to the user explaining the program.
     */

    public static void displayMessage()
    {
        System.out.println("This program will ask you for a max number" +
                           " greater than 10, which the program" +
                           " will then use to find prime " +
                           "numbers from 1 up until the max value given. " +
                           "These prime numbers will then be output" +
                           " to a file.");
    }
    
    /**
     * Method that checks whether a number is prime or not. The method
     * returns prime numbers only.
     * @param dividend Number that is being checked for being prime.
     * @return Returns true if the number can be divided by just itself and 1,
     * and returns false if the number can be divided by more than just
     * itself and one.
     */
    
    public static boolean primeFind(int dividend)
    {
        int divisor = 0;
        int remainderIsZero = 0;
        for (divisor = dividend; divisor >= 1; divisor--)
        {
            if (dividend%divisor==0)
            {
               remainderIsZero++;
            }
        }
        if (remainderIsZero == 2)
        {
            
            return true;
        }
        else
        {
            return false;
            
        }
           
    }
    
}