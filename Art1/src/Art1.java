import java.util.Scanner;
import java.io.*;

/**
 * Written by Kurtis Yoder.
 * This program will receive a filename from the user, then
 * the program will read in the numbers contained in the file.
 * The program will then convert these numbers to a character
 * and output the ASCII art to the console. 
 */

public class Art1 
{

    public static void main(String[] args) throws IOException 
    {
        //Intro to user
        displayIntro();
        
        //Variable to hold the file numbers one at a time
        int number;
        
        
        //Get file from the user
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = keyboard.nextLine();
        
        //Open file to read the numbers
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        
        
        //Read all the numbers from the file and convert them
        while (inputFile.hasNext())
        {
            //Read in a number from the file
            number = inputFile.nextInt();
            
            //Output symbols to console after conversion from numbers
            System.out.print(convertValue(number));
            
        }
        
        //Close the file
        inputFile.close();
        keyboard.close();
        

    }
    
    /**
     * A friendly message to the user explaining the program's use.
     */
    
    public static void displayIntro()
    {
        System.out.println("Welcome to a file conversion program!");
        System.out.println("This program will read in a file " +
                           "chosen by the user that is made up of numbers.");
        System.out.println("Then it will convert it to symbols. These" +
                           " symbols will in turn hopefully create some" +
                           " ASCII art!");
    }
    
    /**
     * Converts the number read from the user file into a symbol.
     * @param number A number read in from the file.
     * @return letter The converted symbol that came from the number in the
     *  file.
     */
    public static char convertValue(int value)
    {
        char letter;
        
        switch (value)
        {
            case 1:
                letter = '|';
                break;
            case 2:
                letter = '-';
                break;
            case 3:
                letter = '/';
                break;
            case 4:
                letter = '\\';
                break;
            case 5:
                letter = '(';
                break;
            case 6:
                letter = ')';
                break;
            case 7:
                letter = '"';
                break;
            case 8:
                letter = '_';
                break;
            case 9:
                letter = ' ';
                break;
            case 0:
                letter = '\n';
                break;
            default:
                letter = ' ';
                break;
         }
        return letter;
    }
}
